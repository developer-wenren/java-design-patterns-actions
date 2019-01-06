package patterns.structure.proxy;

/**
 * @author One
 * @description
 * @date 2019/01/06
 */
public class OrderServiceImpl implements IOrderService {
    @Override
    public int saveOrder(Order order) {
        System.out.println("保存订单 " + order);
        return 1;
    }
}
