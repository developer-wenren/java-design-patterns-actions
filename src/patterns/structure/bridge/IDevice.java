package patterns.structure.bridge;

/**
 * @author One
 * @description 设备
 * @date 2019/01/06
 */
public abstract class IDevice {
    protected IChargeHardware chargeHardware;

    public IDevice(IChargeHardware chargeHardware) {
        this.chargeHardware = chargeHardware;
    }
   abstract public void charge();
}
