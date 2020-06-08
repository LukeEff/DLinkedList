package io.github.lukeeff.file;

/**
 * For building a people file.
 *
 * @author lukeeff
 * @since 1.1
 */
public class PeopleFile extends FileBuilder {

    private final FileHandler fileHandler;

    public PeopleFile() {
        this("people");
    }

    public PeopleFile(String name) {
        super(name, "yml");
        this.fileHandler = new FileHandler(getFile());
    }

    /**
     * Shallow clones a new file with a new name.
     *
     * @param newFileName the new file name.
     * @return the handle of the file.
     */
    public PeopleFile shallowClone(String newFileName) {
        return new PeopleFile(newFileName);
    }




}
