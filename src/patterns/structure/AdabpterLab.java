package patterns.structure;

/**
 * @author One
 * @description 适配器实验
 * @date 2018/10/25
 */
public class AdabpterLab {

    /**
     * 客户端方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 原有业务逻辑
        Target target = new ConcreteTarget();
        target.request(); //  do request...
        // 增加适配后的业务逻辑
        Target target1 = new Adapter();
        target1.request(); //   do something...
        Target target2 = new Adapter2(new Adaptee());
        target2.request(); //  do something...


        // 案例
        VGA2HDMIAdapter vga2HDMIAdapter = new VGA2HDMIAdapter(new VGA() {
            @Override
            public void openVGA() {
                System.out.println("open VGA");
            }
        });

        Laptop laptop = new Laptop();
        laptop.openHDMIPort(vga2HDMIAdapter);

    }


}

interface Target {
    public void request();
}

class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("do request...");
    }
}

class Adaptee {
    public void doSomething() {
        System.out.println("do something...");
    }
}


/**
 * 继承方式实现适配器
 */
class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}

/**
 * 持有方式实现适配器
 */
class Adapter2 implements Target {
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.doSomething();
    }
}

interface HDMI {
    void openHDMI();
}

interface VGA {
    void openVGA();
}

class DisplayScreen implements VGA {
    @Override
    public void openVGA() {
        System.out.println("opening VGA");
    }
}

class VGA2HDMIAdapter implements HDMI {

    private VGA vga;

    public VGA2HDMIAdapter(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void openHDMI() {
        vga.openVGA();
        System.out.println("openning HDMI");
    }
}

class Laptop {
    public void openHDMIPort(HDMI hdmi) {
        hdmi.openHDMI();
    }
}


