package io.github.lukeeff.person;

public class Person {

    private String ID;
    private String first;
    private String last;

    public Person(String first, String last, String ID)
    {
        this.ID = ID;
        this.first = first;
        this.last = last;
    }

    public String toString() {
        return first;
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
