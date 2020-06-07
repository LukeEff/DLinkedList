package io.github.lukeeff.dlinkedlist.list;

import java.util.Iterator;
import java.util.List;

public class DLCList<E> implements IList<E> {

    private Node<E> start;
    private int size;

    public DLCList() {
        this.start = null;
        this.size = 0;
    }

    @Override
    public boolean add(E element) {
        if(start == null) {
            start = new Node<>(element);
        } else {
            final Node<E> newNode = new Node<>(element, start.getPrevious(), start);
            final Node<E> last = start.getPrevious();
            last.setNext(newNode);
            start.setPrevious(newNode);
        }
        size++;
        return true;
    }

    /**
     * Gets a node at a target index.
     *
     * @param index the index of the node.
     * @return the node at the specified index.
     */
    public Node<E> getNode(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("bad index: " + index);
        }
        Node<E> cursor = start;
        for (int i = 0; i < index; i++) {
            cursor = cursor.getNext();
        }
        return cursor;
    }

    @Override
    public boolean addFirst(E element) {
        if(size == 0) {
            add(element);
        } else {
            Node<E> temp = new Node<>(element, start.getPrevious(), start);
            start.getPrevious().setNext(temp);
            start.setPrevious(temp);
            start = temp;
            size++;
        }
        return true;
    }

    @Override
    public boolean addLast(E element) {
        add(element);
        return true;
    }

    @Override
    public boolean addAll(List<E> elements) {
        for (E element : elements) {
            add(element);
        }
        return true;
    }

    @Override
    public void delete(final int index) {
        if(index == 0) {
            deleteFirst();
        } else if(index == size - 1) {
            deleteLast();
        } else {
            Node<E> node = getNode(index);
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
            node.setNull();
            size--;
        }
    }

    @Override
    public void deleteFirst() {
        if(unhandledEerieSize()) {
            Node<E> last = start.getPrevious();
            Node<E> first = start;
            start = start.getNext();
            start.setPrevious(last);
            last.setNext(start);
            first.setNull();
            size--;
        }
    }

    /**
     * Checks for list sizes that wont behave as intended and handles them accordingly.
     *
     * I had too much fun thinking of a name for this method :]
     *
     * @return true if an eerie sized list was handled.
     */
    private boolean unhandledEerieSize() {
        if(size < 1) {
            throw new IndexOutOfBoundsException("You just tried deleting nothing... the last guy to do that was located" +
                    "in the center of our galaxy... think about it...");
        } else if(size() == 1) {
            start.setNull();
            start = null;
            size--;
            return false;
        }
        return true;
    }

    @Override
    public void deleteLast() {
        if(unhandledEerieSize()) {
            Node<E> last = start.getPrevious();
            last.getPrevious().setNext(start);
            start.setPrevious(last.getPrevious());
            last.setNull();
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        start = null;
        size = 0;
    }

    @Override
    public boolean contains(E element) {
       int index = 0;

       while(index < size) {
           if(get(index).equals(element)) {
               return true;
           }
           index++;
       }
       return false;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.getData();
    }

    @Override
    public E getFirst() {
        return start.getData();
    }

    @Override
    public E getLast() {
        return start.getPrevious().getData();
    }

    @Override
    public void set(int index, E element) {
        Node<E> node = getNode(index);
        node.setData(element);
    }

    /**
     * Adds new element into the list at the target index.
     *
     * @param index the index for the element to be stored at.
     * @param element the element to be injected into the list.
     */
    @Override
    public boolean insert(int index, E element) {
        if(index == 0) {
            addFirst(element);
        } else if(index == size) {
            addLast(element);
        } else {
            Node<E> location = getNode(index);
            Node<E> node = new Node<>(element, location.getPrevious(), location);
            location.getPrevious().setNext(node);
            location.getNext().setPrevious(node);
            size++;
        }
        return true;
    }

    public DLCIterator<E> iterator() {
        return new DLCIterator<>(start);
    }

    private class DLCIterator<T> implements Iterator {

        private Node<T> cursor;
        private int size;

        public DLCIterator(Node<T> start) {
            this.cursor = start;
            this.size = DLCList.this.size;
        }

        @Override
        public boolean hasNext() {
            return size > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException("I wouldn't count on this being implemented anytime soon");
        }

        @Override
        public Object next() {
            Node<T> item = cursor;
            size--;
            cursor = cursor.getNext();
            return item.getData();
        }
    }



}
