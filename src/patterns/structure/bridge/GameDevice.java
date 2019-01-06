package patterns.structure.bridge;

/**
 * @author One
 * @description 游戏设备
 * @date 2019/01/06
 */
public class GameDevice extends IDevice {
    public GameDevice(IChargeHardware chargeHardware) {
        super(chargeHardware);
    }

    @Override
    public void charge() {
        System.out.println("游戏设备开始充电");
        this.chargeHardware.charge();
    }
}
