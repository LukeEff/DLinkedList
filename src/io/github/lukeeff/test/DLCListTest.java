package io.github.lukeeff.test;

import io.github.lukeeff.dlinkedlist.list.DLCList;
import io.github.lukeeff.person.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for DLCList.
 *
 * @author lukeeff
 * @since 1.0
 */
public class DLCListTest {

    private DLCList<Person> personDLCList;
    private final Person[] people;
    private final Person aPerson;

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
    public void testAddFirst() {
        personDLCList.addFirst(aPerson);
        assertEquals(aPerson, personDLCList.getFirst());
    }

    @Test
    public void testAddLast() {
        personDLCList.addLast(aPerson);
        assertEquals(aPerson, personDLCList.getLast());
    }

    @Test
    public void testDelete() {
        final int index = 0;
        final Person personAtIndex = personDLCList.get(index);
        personDLCList.delete(index);
        assertFalse(personDLCList.contains(personAtIndex));
    }

    @Test
    public void testDeleteFirst() {
        final Person firstPerson = personDLCList.getFirst();
        personDLCList.deleteFirst();

        assertFalse(personDLCList.contains(firstPerson));
    }

    @Test
    public void testDeleteLast() {
        final Person lastPerson = personDLCList.getLast();
        personDLCList.deleteLast();
        assertFalse(personDLCList.contains(lastPerson));
    }

    @Test
    public void testSet() {
        personDLCList.set(0, aPerson);
        assertEquals(aPerson, personDLCList.get(0));
    }

    @Test
    public void testInsert() {
        personDLCList.insert(0, aPerson);
        assertEquals(aPerson, personDLCList.get(0));
    }

    @Test
    public void testAddAll() {
        personDLCList.addAll(Arrays.asList(people));
        assertEquals(personDLCList.size(), people.length * 2);
    }

    @Test
    public void testClear() {
        personDLCList.clear();
        assertEquals(0, personDLCList.size());
    }

    @Test
    public void testContains() {
        assertTrue(personDLCList.contains(people[0]));
        assertFalse(personDLCList.contains(aPerson));
    }

    @Test
    public void testGetFirst() {
        assertEquals("123456789", personDLCList.getFirst().getID());
    }

    @Test
    public void testGetLast() {
        assertEquals("345678901", personDLCList.getLast().getID());
    }

    @AfterEach
    public void tearDown() {

    }


}
