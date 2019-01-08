package patterns.behavior.iterator;

/**
 * @author One
 * @description
 * @date 2019/01/08
 */
public class Food {
    private int price;
    private String name;

    public Food(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
