package io.github.lukeeff.test;

import io.github.lukeeff.file.PeopleFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit testing for PeopleFile
 *
 * @author lukeeff
 * @since 1.1
 */
public class PeopleFileTest {

    private PeopleFile peopleFile;
    private PeopleFile peopleFileClone;

    @BeforeEach
    public void setUp() {
        peopleFile = new PeopleFile();
    }

    @Test
    public void testShallowClone() {
        peopleFileClone = peopleFile.shallowClone("peopleClone");
        String theName = peopleFile.toString().replaceAll("people", "peopleClone");
        assertEquals(theName, peopleFileClone.toString());
    }

}
