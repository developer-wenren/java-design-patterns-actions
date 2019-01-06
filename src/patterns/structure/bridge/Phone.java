package patterns.structure.bridge;

/**
 * @author One
 * @description 手机
 * @date 2019/01/06
 */
public class Phone extends IDevice {
    public Phone(IChargeHardware chargeHardware) {
        super(chargeHardware);
    }

    @Override
    public void charge() {
        chargeHardware.charge();
    }
}
