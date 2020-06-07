package io.github.lukeeff.dlinkedlist.list;

import java.util.List;

/**
 * Interface for any of our custom lists. In this case, it was used for DLCList.
 *
 * @see DLCList implements IList
 * @param <E> type of element contained in the list.
 * @author lukeeff
 * @since 1.0
 */
public interface IList<E> {

    /**
     * Adds an element to the list at a target index.
     *
     * @param index the index of the list to have the element injected into.
     * @param element the element to be added to the list.
     * @return true when added.
     */
    boolean insert(int index, E element);

    /**
     * Add an element to the list.
     *
     * @param element the element to be added.
     * @return true when added.
     */
    boolean add(E element);

    /**
     * Add an element to the beginning of the list.
     *
     * @param element the element to be added.
     * @return true when added.
     */
    boolean addFirst(E element);

    /**
     * Adds an element to the end of the list.
     *
     * @param element the element to be added.
     * @return true when added.
     */
    boolean addLast(E element);

    /**
     * Adds a list of elements into the list.
     *
     * @param elements the elements to be added.
     * @return true when added.
     */
    boolean addAll(List<E> elements);

    /**
     * Deletes an element at a target index.
     *
     * @param index the index where the element is that will be removed.
     */
    void delete(int index);

    /**
     * Deletes the first element in the list.
     */
    void deleteFirst();

    /**
     * Deletes the last element in the list.
     */
    void deleteLast();

    /**
     * Gets the size of the list.
     *
     * @return the size of the list.
     */
    int size();

    /**
     * Clears the list.
     */
    void clear();

    /**
     * Checks if an element is contained within the list.
     *
     * @param element the element to be queried for.
     * @return true if it was found in the list.
     */
    boolean contains(E element);

    /**
     * Gets an element from the list.
     *
     * @param index the index of the element.
     * @return the element at the target index.
     */
    E get(int index);

    /**
     * Gets the first element from the list.
     *
     * @return the first element from the list.
     */
    E getFirst();

    /**
     * Gets the last element from the list.
     * @return the last element from the list.
     */
    E getLast();

    /**
     * Sets an element at a target index, replacing the current element at that index.
     *
     * @param index the index the element will be set at.
     * @param element the element to be set into the list.
     */
    void set(int index, E element);



}
