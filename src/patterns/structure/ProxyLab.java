package patterns.structure;

/**
 * @author One
 * @description 代理模式实验
 * @date 2018/10/30
 */
public class ProxyLab {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();//RealSubject requst
    }
}

//通用代码
/**
 * 业务功能约束
 */
interface Subject {
    void request();
}

/**
 * 被代理类
 */
class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject requst");
    }
}

/**
 * 代理类
 */
class Proxy implements Subject {
    private RealSubject realSubject;

    Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}

