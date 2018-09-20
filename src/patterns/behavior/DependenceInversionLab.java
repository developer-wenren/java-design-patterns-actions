package patterns.behavior;

/**
 * @author One
 * @description 依赖注入原则
 * @date 2018/09/20
 */
public class DependenceInversionLab {

    public static void main(String[] args) {
        Driver driver = new Driver();
        ICar car = new Benz();
        driver.drive(car);
        //Benz runing
        car = new BMW();
        driver.drive(car);
        //BMW runing
        car = new Audio();
        driver.drive(car);
        //Audio runing
    }
}

/**
 * 抽象接口-车
 */
interface ICar {
    void run();
}

class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("Benz runing");
    }
}

class Audio implements ICar {
    @Override
    public void run() {
        System.out.println("Audio runing");
    }
}

class BMW implements ICar {
    @Override
    public void run() {
        System.out.println("BMW runing");
    }
}

/**
 * 功能方法依赖抽象,而不是实现类
 */
class Driver {
    void drive(ICar car) {
        car.run();
    }
}
