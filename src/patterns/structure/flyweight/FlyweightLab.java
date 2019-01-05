package patterns.structure.flyweight;

/**
 * @author One
 * @description 享元模式应用层
 * @date 2019/01/05
 */
public class FlyweightLab {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        Bean beanA = beanFactory.getBean("beanA");
        Bean beanB = beanFactory.getBean("beanB");
        Bean beanA2 = beanFactory.getBean("beanA");
        /**
         * 新建 Bean :beanA
         * 新建 Bean :beanB
         */
    }
}
