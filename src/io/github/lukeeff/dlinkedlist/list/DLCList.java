package io.github.lukeeff.dlinkedlist.list;

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

    /**
     *
     *
     * @param element the element to be added to the list.
     * @return
     */
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


    @Override
    public boolean addFirst(T element) {
        Node<T> node = new Node<>(element);
        return true;
    }

    @Override
    public boolean addLast(T element) {
        return true;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void deleteLast() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T object) {
        return true;
    }

    @Override
    public T get(int index) {
        return start.getData();
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

}
