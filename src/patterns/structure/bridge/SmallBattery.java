package patterns.structure.bridge;

/**
 * @author One
 * @description 电池
 * @date 2019/01/06
 */
public class SmallBattery implements IChargeHardware{
    @Override
    public void charge() {
        System.out.println("小电池充电");
    }
}
