package patterns.behavior.template;

/**
 * @author One
 * @description
 * @date 2019/01/08
 */
public abstract class AbastractTea {
    protected final void makeTea(){
        boilWater();
        putTeaLeaf();
        mixed();
    }

    protected final void  boilWater(){
        System.out.println("把水烧开");
    }

    abstract public void putTeaLeaf();

    protected final void mixed(){
        System.out.println("混合搅拌");
    }
}
