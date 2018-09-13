package patterns.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式 Singleton
 *
 * @author One
 * Coding By One ON 09/13
 */
public class SingletonLab {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1_1 singleton1_1 = Singleton1_1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3_1 singleton3_1 = Singleton3_1.getInstance();

        Singleton4 singleton4 = Singleton4.getInstance();

        Singleton5 singleton5 = Singleton5.INSTANCE;

        Singleton1 singleton11 = null;
        Constructor<?>[] declaredConstructors = Singleton1.class.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            singleton11 = (Singleton1) constructor.newInstance();
        }
        System.out.println(singleton1.equals(singleton11));

    }
}

/**
 * 版本1
 */
class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}

/**
 * 版本2
 */
class Singleton1_1 {
    private static Singleton1_1 instance = null;

    static {
        try {
            instance = new Singleton1_1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Singleton1_1() {
    }

    public static Singleton1_1 getInstance() {
        return instance;
    }
}

/**
 * 版本2
 */
class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

/**
 * 版本3
 */
class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

/**
 * 版本3.1
 */
class Singleton3_1 {
    private volatile static Singleton3_1 instance = null;

    private Singleton3_1() {
    }

    public static Singleton3_1 getInstance() {
        if (instance == null) {
            synchronized (Singleton3_1.class) {
                if (instance == null) {
                    instance = new Singleton3_1();
                }
            }
        }
        return instance;
    }
}

/**
 * 版本4
 */
class Singleton4 {
    private Singleton4() {
    }

    private static class SingletonHolder {
        public final static Singleton4 INSTACNE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.INSTACNE;
    }
}

/**
 * 版本5
 */
enum Singleton5 {
    INSTANCE;
    public void method1() {
        System.out.println("单例方法执行");
    }
}