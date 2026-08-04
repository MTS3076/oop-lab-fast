package Lab09;


interface IoTDevice {
    default void update() {
        System.out.println("Device software updated.");
    }

    static void info() {
        System.out.println("IoT Device Information.");
    }
}

class SmartDevice2 implements IoTDevice {
    public static void main(String[] args) {
        SmartDevice2 d = new SmartDevice2();

        d.update();
        IoTDevice.info();
    }
}
