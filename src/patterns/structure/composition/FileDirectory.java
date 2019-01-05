package patterns.structure.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author One
 * @description 文件夹
 * @date 2019/01/05
 */
public class FileDirectory extends AbstractFile {
    private List<AbstractFile> files = new ArrayList<AbstractFile>();


    private Integer level;

    public FileDirectory(String name, Integer level) {
        super();
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public void list() {
        System.out.println("文件夹:" + this.getName());
        for (AbstractFile file : files) {
            for (int i = 0; i < this.level; i++) {
                System.out.print("  ");
            }
//            System.out.println("文件:" + file.getName() + " 大小:" + file.getSize());
            file.list();
        }
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<AbstractFile> getFiles() {
        return files;
    }
}
