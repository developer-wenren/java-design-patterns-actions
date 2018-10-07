package patterns.creational;

/**
 * @author One
 * @description 建造者模式
 * @date 2018/10/07
 */
public class BuilderLab {
    Director director = new Director();

    public static void main(String[] args) {
        BuilderLab builderLab = new BuilderLab();
        Director director = builderLab.director;

        // 获取负责产品对象
        Product product = director.getProduct();
        product.doSomething();
    }

    public class Product {
        public void doSomething() {
            System.out.println("do something");
        }
    }

    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    public abstract class Builder {
        public abstract void build1(); //建造产品步骤1

        public abstract void build2(); //建造产品步骤2

        public abstract Product buildProduct();
    }

    public class ConcreteProduct extends Builder {
        //设置产品零件
        private Product product = new Product();

        @Override
        public void build1() {
            // 对 product进行组装
            System.out.println("build part1");
        }

        @Override
        public void build2() {
            // 对 product进行组装
            System.out.println("build part2");
        }

        @Override
        public Product buildProduct() {
            return product;
        }
    }

    public class Director {
        private Builder builder = new ConcreteProduct();

        /**
         * 构建不同的产品
         */
        public Product getProduct() {
            // 允许组装不同的对象
            builder.build1();
            builder.build2();
            return builder.buildProduct();
        }
    }


}
