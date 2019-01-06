package patterns.structure.proxy;

/**
 * @author One
 * @description
 * @date 2019/01/06
 */
public class Order {
    private Integer price;
    private String subject;

    public Order(Integer price, String subject) {
        this.price = price;
        this.subject = subject;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", subject='" + subject + '\'' +
                '}';
    }
}
