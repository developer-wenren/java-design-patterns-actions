package patterns.creational;

/**
 * @author One
 * @description 简单工厂
 * @date 2018/09/14
 */
public class SimpleFactoryLab {
    private static AppleDeviceFactory appleDeviceFactory = new AppleDeviceFactory();

    public static void main(String[] args) {
        Device pad = appleDeviceFactory.createDevice(DeviceType.PAD);
        Device phone = appleDeviceFactory.createDevice(DeviceType.PHONE);
        Device watch = appleDeviceFactory.createDevice(DeviceType.WATCH);
    }
}

interface Device {
}

class Pad implements Device {
}

class Phone implements Device {
}

class Watch implements Device {
}

enum DeviceType {
    PAD, PHONE, WATCH
}

interface IDeviceFactory {
    Device createDevice(DeviceType type);
}

class AppleDeviceFactory implements IDeviceFactory {

    @Override
    public Device createDevice(DeviceType type) {
        Device device = null;
        switch (type) {
            case PAD:
                device = new Pad();
                break;
            case PHONE:
                device = new Phone();
                break;
            case WATCH:
                device = new Watch();
                break;
            default:
                device = new Phone();
        }
        return device;
    }
}


