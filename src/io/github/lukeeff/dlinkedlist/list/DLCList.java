package io.github.lukeeff.dlinkedlist.list;

import java.util.Iterator;

public class DLCList<T> implements IList<T> {

    private Node<T> start;
    private int size;

    public DLCList() {
        this.start = null;
        this.size = 0;
    }

    @Override
    public boolean add(int index, T element) {
        return true;
    }

    @Override
    public boolean add(T element) {
        if(start == null) {
            start = new Node<>(element);
        } else {
            final Node<T> newNode = new Node<>(element, start.getPrevious(), start);
            final Node<T> last = start.getPrevious();
            last.setNext(newNode);
            last.setPrevious(newNode);
        }
        size++;
        return true;
    }

    public Node<T> getNode(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("bad index: " + index);
        }
        Node<T> cursor = start;
        for (int i = 0; i < index; i++) {
            cursor = cursor.getNext();
        }
        return cursor;
    }

    @Override
    public boolean addFirst(T element) {
        add(0, element);
        return true;
    }

    @Override
    public boolean addLast(T element) {
        add(element);
        return true;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void deleteFirst() {
        delete(0);
    }

    @Override
    public void deleteLast() {
        delete(size);
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
    public boolean contains(T object) {
        boolean found = false;

        for(int i = 0; i < size; i++) {
            if()
        }

        return true;
    }

    @Override
    public T get(int index) {
        Node<T> node = getNode(index);
        return node.getData();
    }

    @Override
    public T getFirst() {
        return start.getData();
    }

    @Override
    public T getLast() {
        return start.getPrevious().getData();
    }

    @Override
    public void set(int index, T object) {

    }

    public DLCIterator<T> iterator() {
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
            throw new UnsupportedOperationException("Not yet implemented");
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
