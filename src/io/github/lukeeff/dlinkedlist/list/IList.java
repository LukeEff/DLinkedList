package io.github.lukeeff.dlinkedlist.list;

public interface IList<T> {

    boolean add(int index, T element);
    boolean add(T element);
    boolean addFirst(T element);
    boolean addLast(T element);

    void delete(int index);
    void deleteFirst();
    void deleteLast();

    int size();
    void clear();
    boolean contains(T object);

    T get(int index);
    T getFirst();
    T getLast();

    void set(int index, T object);



}
