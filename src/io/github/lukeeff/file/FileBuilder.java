package io.github.lukeeff.file;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * For creating new files.
 *
 * @author lukeeff
 * @since 1.1
 */
public class FileBuilder {

    private final String fileName;
    private final String format;
    private File file;
    private File fileFolder;

    public FileBuilder(String fileName, String format) {
        this.fileName = validifyName(fileName, "file", "unnamed");
        this.format = validifyName(format, "format", "yml");
        createFiles();
    }

    /**
     * Ensures a name is valid before building a File.
     *
     * @param name the name of the file.
     * @param type the type of file (for error msg).
     * @param defaultName the default name for the file to have if it doesn't have a valid one.
     * @return a valid file name.
     */
    private String validifyName(String name, String type, String defaultName) {
        final String errorMsg = type + "cannot be null!";
        return (Objects.requireNonNull(name, errorMsg).length() < 1) ? defaultName : name;
    }

    /**
     * Creates the files. This should not ever fail.
     */
    private void createFiles() {
        try {
            createFolder();
            createFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates a folder with the name DLinkedList at the path.
     */
    private void createFolder() throws IOException {
        fileFolder = new File("DLinkedList").getCanonicalFile();
        if(!fileFolder.exists()) {
            fileFolder.mkdirs();
        }
    }

    /**
     * Creates a new file if not existent.
     *
     */
    private void createFile() throws IOException {
        file = new File(fileFolder, fileName.concat(".").concat(format));
        if(!file.exists()) {
            file.createNewFile();
        }
    }

    public String getFileName() {
        return fileName;
    }

    public String getFormat() {
        return format;
    }

    public File getFile() {
        return file;
    }

    public File getFileFolder() {
        return fileFolder;
    }

    @Override
    public String toString() {
        return "Folder: " + fileFolder.toString() + "\nPath: " + fileFolder.getPath() + "\nFile: "
                + file.toString() + "\n Path: " + file.getPath();
    }

}
