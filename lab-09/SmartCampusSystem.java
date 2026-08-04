package Lab09;

interface WiFi {
    default void connect() {
        System.out.println("[WiFi] Connecting via WiFi...");
    }
    String getSSID();
}

interface Bluetooth {
    default void connect() {
        System.out.println("[Bluetooth] Connecting via Bluetooth...");
    }
    void pairDevice(String deviceName);
}

class SmartDevice implements WiFi, Bluetooth {

    private String deviceName;
    private String ssid;
    private FAST.Department department;

    public SmartDevice(String deviceName, String ssid, FAST.Department department) {
        this.deviceName = deviceName;
        this.ssid = ssid;
        this.department = department;
    }

    @Override
    public void connect() {
        System.out.println("\n[SmartDevice] '" + deviceName + "' connecting (conflict resolved)...");
        connectViaWiFi();
        connectViaBluetooth();
    }

    public void connectViaWiFi() {
        WiFi.super.connect();
    }

    public void connectViaBluetooth() {
        Bluetooth.super.connect();
    }

    @Override
    public String getSSID() {
        return ssid;
    }

    @Override
    public void pairDevice(String targetDevice) {
        System.out.println("[Bluetooth] '" + deviceName + "' paired with: " + targetDevice);
    }

    public void showInfo() {
        System.out.println("Device   : " + deviceName);
        System.out.println("SSID     : " + ssid);
        System.out.println("Dept     : " + department.getInfo());
    }
}

class FAST {

    static class Department {
        private String name;
        private String location;

        public Department(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public String getName() { return name; }
        public String getLocation() { return location; }

        public String getInfo() {
            return name + " (Block: " + location + ")";
        }
    }

    public static void main(String[] args) {

        Department cs = new Department("Computer Science", "A-Block");
        Department ee = new Department("Electrical Engineering", "B-Block");

        SmartDevice laptop = new SmartDevice("CS Laptop", "FAST-CS-WiFi", cs);
        SmartDevice sensor = new SmartDevice("EE IoT Sensor", "FAST-EE-WiFi", ee);

        System.out.println("==============================");
        System.out.println("  FAST Smart Campus System   ");
        System.out.println("==============================");

        System.out.println("\n--- Device 1 ---");
        laptop.showInfo();
        laptop.connect();
        laptop.pairDevice("CS Projector");
        System.out.println("SSID: " + laptop.getSSID());

        System.out.println();

        System.out.println("--- Device 2 ---");
        sensor.showInfo();
        sensor.connect();
        sensor.pairDevice("EE Gateway Hub");
        System.out.println("SSID: " + sensor.getSSID());

        System.out.println("\n==============================");
        System.out.println("  System Initialized OK       ");
        System.out.println("==============================");
    }
}


       





