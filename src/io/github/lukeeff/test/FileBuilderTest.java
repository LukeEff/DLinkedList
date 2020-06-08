package io.github.lukeeff.test;

import io.github.lukeeff.file.FileBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * FileBuilder class unit testing
 *
 * @author lukeeff
 * @since 1.1
 */
public class FileBuilderTest {

    public FileBuilder file;

    @BeforeEach
    public void setUp() {
        file = new FileBuilder("test", "yml");
    }

    @Test
    public void testGetFileName() {
        assertEquals("test", file.getFileName());
    }

    /*
     Wasn't sure how to make this...
     */
    @Test
    public void testGetFile() {
        assertNotNull(file.getFile());
    }

    /*
    Wasn't sure how to make this...
     */
    @Test
    public void testGetFolder() {
        assertNotNull(file.getFileFolder());
    }

    @Test
    public void testGetFormat() {
        assertEquals("yml", file.getFormat());
    }

}
