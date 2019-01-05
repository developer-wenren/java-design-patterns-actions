package patterns.structure.composition;

/**
 * @author One
 * @description 具体文件
 * @date 2019/01/05
 */
public class File extends AbstractFile {
    public File(String name, String size) {
        super();
        this.setName(name);
        this.setSize(size);
    }

    @Override
    public void list() {
        System.out.println("文件:" + this.getName() + " 大小:" + this.getSize());
    }
}
