package io.github.lukeeff;

import io.github.lukeeff.dlinkedlist.list.DLCList;
import io.github.lukeeff.person.Person;

public class DLinkedList {

    public static void main(String[] args) {
        //foo();
    }

    private static void foo() {
        final DLCList<Person> personDLCList = new DLCList<>();
        final Person person = new Person("John", "Appleseed", "820122192");
        personDLCList.addFirst(person);
    }

}
