package io.github.lukeeff.person;

/**
 * A class built with the intention to toy with the list and node code.
 *
 * @author lukeeff
 * @since 1.0
 */
public class Person {

    private final String ID;
    private final String first;
    private final String last;

    public Person(String first, String last, String ID)
    {
        this.ID = ID;
        this.first = first;
        this.last = last;
    }

    public String toString() {
        return first + " " + last + "," + "ID: " + ID;
    }

    public String getID() {
        return this.ID;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

}
