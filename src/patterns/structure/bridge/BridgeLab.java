package patterns.structure.bridge;

/**
 * @author One
 * @description 桥接模式实验
 * @date 2019/01/06
 */
public class BridgeLab {
    public static void main(String[] args) {
        IDevice ps4 = new GameDevice(new NormalBattery());
        ps4.charge();
        /**
         * 游戏设备开始充电
         * 普通电池充电
         */

        IDevice phone = new Phone(new SmallBattery());
        phone.charge();
        /**
         * 小电池充电
         */
    }
}
