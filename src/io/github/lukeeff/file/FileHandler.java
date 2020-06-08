package io.github.lukeeff.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * For reading/writing to files and other utilities.
 *
 * This could be full of static methods, but I plan to do more with it.
 *
 * @author lukeeff
 * @since 1.1
 */
public class FileHandler {

    private final File file;

    public FileHandler(File file) {
        this.file = file;
    }

    public boolean write(String string) {
        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath())) {
            writer.write(string, 0, string.length());
            return true;
        } catch (IOException ioException) {
            System.err.format("IOException: %s%n", ioException);
            return false;
        }
    }

    public List<String> read() {
        List<String> lines = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            String line;
            while((line = reader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException ioException) {
            System.err.format("IOException: %s%n", ioException);
        }
        return lines;
    }

}
