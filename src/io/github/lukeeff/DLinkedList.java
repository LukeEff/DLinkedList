package io.github.lukeeff;

import io.github.lukeeff.dlinkedlist.list.DLCList;
import io.github.lukeeff.person.Person;

public class DLinkedList {

    public static void main(String[] args) {
        //foo();
        System.out.println(reverse("Hello, world!"));
        System.out.println(fib(10000));
    }

    private static void foo() {
        final DLCList<Person> personDLCList = new DLCList<>();
        final Person person = new Person("John", "Appleseed", "820122192");
        personDLCList.addFirst(person);
    }

    public static String reverse(String s) {
        return (s.length() < 1) ? s : reverse(s.substring(1)).concat(s.substring(0,1));
    }

    /*
     * horrible algorithm
     */
    public static int fib(int num) {
        return (num <= 1) ? num : fib(num - 1) + (fib(num - 2));
    }

}
