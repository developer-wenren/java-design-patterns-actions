package patterns.structure.composition;

/**
 * @author One
 * @description 文件
 * @date 2019/01/05
 */
public abstract class AbstractFile {
    protected String name;
    protected String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void add(AbstractFile file) {
        throw new RuntimeException("不支持添加文件");
    }

    public void remove(AbstractFile file) {
        throw new RuntimeException("不支持删除文件");
    }

    public void list() {
        throw new RuntimeException("不支持列举当前文件信息");
    }
}
