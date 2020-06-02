package io.github.lukeeff.dlinkedlist.list;

public class Node<T> {

    private Node<T> previous;
    private Node<T> next;
    private T data;

    public Node(T data)
    {
        init(data, this, this);
    }

    public Node(T data, Node<T> previous, Node<T> next) {
        init(data, previous, next);
    }

    public T getData() {
        return data;
    }

    private void init(T data, Node<T> previous, Node<T> next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
