package designpattern.patterns.structure.composite.filenodes.refactor;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}
