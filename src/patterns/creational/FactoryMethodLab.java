package patterns.creational;

/**
 * @author One
 * @description 工厂方法实验
 * @date 2018/09/17
 */
public class FactoryMethodLab {
    private static Factory factory = new ConcreteFactory();
    public static void main(String[] args) {

        ConcreteProduct1 product = factory.createProduct(ConcreteProduct1.class);
        product.method2();
        System.out.println("===============");
        ConcreteProduct2 product2 = factory.createProduct(ConcreteProduct2.class);
        product2.method2();
    }

}

/**
 * 抽象产品类
 */
abstract class Product {
    /**
     * 公共方法
     */
    public void method1() {
        // 逻辑处理
    }

    // 抽象方法,自定义逻辑实现
    public abstract void method2();
}

/**
 * 具体产品类1
 */
class ConcreteProduct1 extends Product {
    @Override
    public void method2() {
        System.out.println("ConcreteProduct1 method");
    }
}

/**
 * 具体产品类2
 */
class ConcreteProduct2 extends Product {
    @Override
    public void method2() {
        System.out.println("ConcreteProduct2 method");
    }
}

/**
 * 抽象工厂类
 */
abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> c);
}

/**
 * 具体工厂实现
 */
class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("创建出错");
        }
        return (T) product;
    }
}
