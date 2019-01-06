package patterns.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author One
 * @description 代理工厂
 * @date 2019/01/06
 */
public class ProxyFactory<T> implements InvocationHandler {
    private T target;

    public ProxyFactory(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(args);
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }

    private void afterMethod() {
        System.out.println("代理对象执行后方法增强");
    }

    private void beforeMethod(Object[] args) {
        System.out.println("代理对象执行前方法增强, 参数:" + Arrays.toString(args));
    }

    public T getProxyObject() {
        Class<?> aClass = target.getClass();
        return (T) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }
}
