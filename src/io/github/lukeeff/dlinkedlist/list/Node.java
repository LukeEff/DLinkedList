package io.github.lukeeff.dlinkedlist.list;

/**
 * Node class that does neat things :D
 *
 * @param <E> the type of object being stored in this node.
 * @author lukeeff
 * @since 1.0
 */
public class Node<E> {

    /**
     * Previous - The previous node in the chain.
     * Next - The next node in the chain.
     * Data - The object stored in this node.
     */
    private Node<E> previous;
    private Node<E> next;
    private E data;

    /**
     * Called when a brand new node tree is defined.
     *
     * @param data the handle to be stored in the node.
     */
    public Node(E data)
    {
        init(data, this, this);
    }

    /**
     * Constructor for node to be injected into existing node tree.
     *
     * @param data handle to be stored in this node.
     * @param previous previous node handle.
     * @param next next node handle.
     */
    public Node(E data, Node<E> previous, Node<E> next) {
        init(data, previous, next);
    }

    /**
     * Initializes field variables.
     *
     * @param data the data.
     * @param previous the previous node.
     * @param next the post-positional node.
     */
    private void init(E data, Node<E> previous, Node<E> next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    /**
     * Sets the data, previous, and next fields to null.
     *
     * Exists to avoid memory leaks.
     */
    public void setNull() {
        data = null;
        previous = null;
        next = null;
    }

    @Override
    public String toString() {
        return "Node -> Data: " + getData();
    }
}
