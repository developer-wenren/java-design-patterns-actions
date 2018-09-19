package patterns.creational;

/**
 * @author One
 * @description 抽象工厂模式实战
 * @date 2018/09/19
 */
public class AbastractFactoryLab {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ServerComputerFactory("2.9GHz", "16GB");
        Computer computer = computerFactory.createComputer();
        System.out.println(computer.getClass().getSimpleName() + " config :" + computer);
        //ServerComputer config :cpu: 2.9GHz, memory: 16GB
        computerFactory = new PCComputerFactory("2.4GHz", "4GB");
        computer = computerFactory.createComputer();
        System.out.println(computer.getClass().getSimpleName() + " config :" + computer);
        //PCComputer config :cpu: 2.4GHz, memory: 4GB
    }
}

/**
 * 计算机工厂接口,亦可以是抽象类
 */
interface ComputerFactory {
    Computer createComputer();
}

/**
 * 服务器产品工厂类
 */
class ServerComputerFactory implements ComputerFactory {
    private String cpu;
    private String memory;

    ServerComputerFactory(String cpu, String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    public Computer createComputer() {
        return new ServerComputer(this.cpu, this.memory);
    }
}

/**
 * PC产品工厂类
 */
class PCComputerFactory implements ComputerFactory {
    private String cpu;
    private String memory;

    PCComputerFactory(String cpu, String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    public Computer createComputer() {
        return new PCComputer(this.cpu, this.memory);
    }
}


/**
 * 抽象产品类
 */
abstract class Computer {
    abstract String getCPU();

    abstract String getMemory();

    @Override
    public String toString() {
        return "cpu: " + getCPU() + ", memory: " + getMemory();
    }
}

/**
 * 服务器产品
 */
class ServerComputer extends Computer {
    private String cpu;
    private String memory;

    ServerComputer(String cpu, String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    String getCPU() {
        return this.cpu;
    }

    @Override
    String getMemory() {
        return this.memory;
    }
}

/**
 * PC产品
 */
class PCComputer extends Computer {
    private String cpu;
    private String memory;

    PCComputer(String cpu, String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    String getCPU() {
        return this.cpu;
    }

    @Override
    String getMemory() {
        return this.memory;
    }
}
