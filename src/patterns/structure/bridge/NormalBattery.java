package patterns.structure.bridge;

/**
 * @author One
 * @description 电池
 * @date 2019/01/06
 */
public class NormalBattery implements IChargeHardware{
    @Override
    public void charge() {
        System.out.println("普通电池充电");
    }
}
