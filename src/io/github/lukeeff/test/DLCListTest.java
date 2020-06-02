package io.github.lukeeff.test;

import io.github.lukeeff.dlinkedlist.list.DLCList;
import io.github.lukeeff.person.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DLCListTest {

    private DLCList<Person> personDLCList;
    private Person[] people;
    private Person aPerson;

    public DLCListTest() {
        people = new Person[] {
                new Person("Bob", "Smith", "123456789"),
                new Person("Paula", "Thomas", "234567890"),
                new Person("Gina", "Roberts", "345678901")
        };
        aPerson = new Person("Gina", "Roberts", "345678901");

    }


    @BeforeEach
    public void setUp() {
        this.personDLCList = new DLCList<>();
        personDLCList.add(people[0]);
        personDLCList.add(people[1]);
        personDLCList.add(people[2]);

    }

    @Test
    public void testLength() {
        assertEquals(people.length, personDLCList.size());
    }

    @Test
    public void testAdd() {
        personDLCList.add(aPerson);
        assertEquals(personDLCList.size(), people.length + 1);
    }

    @Test
    public void testGetFirst() {
        assertEquals("123456789", personDLCList.getFirst().getID());
    }

    @Test
    public void testGetLast() {
        assertEquals("234567890", personDLCList.getLast().getID());
    }

    @AfterEach
    public void tearDown() {

    }


}
