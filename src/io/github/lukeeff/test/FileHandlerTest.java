package io.github.lukeeff.test;

import io.github.lukeeff.file.FileHandler;
import io.github.lukeeff.file.PeopleFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit testing for FileHandler class
 *
 * @author lukeeff
 * @since 1.1
 */
public class FileHandlerTest {

    private FileHandler handler;
    private final PeopleFile file;

    public FileHandlerTest() {
        this.file = new PeopleFile();
    }

    @BeforeEach
    public void setUp() {
        this.handler = new FileHandler(file.getFile());
    }

    @Test
    public void testWrite() {
        String write = "Hello";
        assertTrue(handler.write(write));
    }

    @Test
    public void testRead() {
        testWrite();
        List<String> content = new ArrayList<>();
        content.add("Hello");
        assertEquals(content, handler.read());
    }

}
