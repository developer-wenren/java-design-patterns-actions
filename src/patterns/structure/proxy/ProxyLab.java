package patterns.structure.proxy;

/**
 * @author One
 * @description 代理模式应用实验
 * @date 2019/01/06
 */
public class ProxyLab {
    public static void main(String[] args) {
        ProxyFactory<IOrderService> proxyFactory = new ProxyFactory(new OrderServiceImpl());
        IOrderService orderService = proxyFactory.getProxyObject();
        orderService.saveOrder(new Order(8888, "iPhoneXR"));
        /**
         * 代理对象执行前方法增强, 参数:[Order{price=8888, subject='iPhoneXR'}]
         * 保存订单 Order{price=8888, subject='iPhoneXR'}
         * 代理对象执行后方法增强
         */
    }
}
