package patterns.structure.composition;

/**
 * @author One
 * @description 组合模式应用
 * @date 2019/01/05
 */
public class CompositionLab {
    public static void main(String[] args) {
        AbstractFile excelFile = new File("work.excel", "4k");
        AbstractFile javaFile = new File("work.java", "34k");
        AbstractFile java2File = new File("work2.java", "14k");
        AbstractFile javaFileDirectory = new FileDirectory("java", 2);
        javaFileDirectory.add(javaFile);
        javaFileDirectory.add(java2File);
        AbstractFile mainFileDirectory = new FileDirectory("main", 1);
        mainFileDirectory.add(excelFile);
        mainFileDirectory.add(javaFileDirectory);

        // 列举main目录下所有文件信息
        mainFileDirectory.list();
    }
}
