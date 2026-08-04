package Lab09;

interface ElectricSystem {
    default void displayStatus() {
        System.out.println("[Electric] Battery level: 85% | Mode: Eco");
    }
    String getEnergyMode();
}

interface GPSSystem {
    default void displayStatus() {
        System.out.println("[GPS] Location: 24.8607N, 67.0011E | Signal: Strong");
    }
    String getNavigationUpdate();
}

abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void startEngine();

    public void showInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}

class SmartVehicle extends Vehicle implements ElectricSystem, GPSSystem {

    private Engine engine;

    public SmartVehicle(String brand, String model) {
        super(brand, model);
        this.engine = new Engine();
    }

    @Override
    public void startEngine() {
        System.out.println("[SmartVehicle] Push-start initiated for " + brand + " " + model);
        engine.initialize();
    }

    @Override
    public void displayStatus() {
        ElectricSystem.super.displayStatus();
        GPSSystem.super.displayStatus();
    }

    public void displayElectricStatus() {
        ElectricSystem.super.displayStatus();
    }

    public void displayGPSStatus() {
        GPSSystem.super.displayStatus();
    }

    @Override
    public String getEnergyMode() {
        return "Electric | Regenerative Braking: ON";
    }

    @Override
    public String getNavigationUpdate() {
        return "Route: DHA to Gulshan | ETA: 22 mins | Traffic: Moderate";
    }

    public Engine getEngine() {
        return engine;
    }

    class Engine {
        private boolean running;

        private Engine() {
            this.running = false;
        }

        public void initialize() {
            running = true;
            System.out.println("[Engine] Internal systems online for " + brand + " " + model);
            System.out.println("[Engine] Running: " + running);
        }

        public void shutdown() {
            running = false;
            System.out.println("[Engine] Shutting down for " + brand + " " + model);
            System.out.println("[Engine] Running: " + running);
        }

        public boolean isRunning() {
            return running;
        }
    }
}

class RemoteStartVehicle extends Vehicle implements ElectricSystem {

    public RemoteStartVehicle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void startEngine() {
        System.out.println("[RemoteStartVehicle] Remote start activated for " + brand + " " + model);
    }

    @Override
    public void displayStatus() {
        ElectricSystem.super.displayStatus();
    }

    @Override
    public String getEnergyMode() {
        return "Hybrid | Mode: Power Save";
    }
}

class AutomobileSystem {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("    Smart Vehicle System          ");
        System.out.println("==================================");

        SmartVehicle sv = new SmartVehicle("Tesla", "Model S");

        System.out.println("\n--- Smart Vehicle Info ---");
        sv.showInfo();

        System.out.println("\n--- Starting Engine ---");
        sv.startEngine();

        System.out.println("\n--- Combined Status (conflict resolved) ---");
        sv.displayStatus();

        System.out.println("\n--- Electric Status Only ---");
        sv.displayElectricStatus();

        System.out.println("\n--- GPS Status Only ---");
        sv.displayGPSStatus();

        System.out.println("\n--- Energy Mode ---");
        System.out.println(sv.getEnergyMode());

        System.out.println("\n--- Navigation Update ---");
        System.out.println(sv.getNavigationUpdate());

        System.out.println("\n--- Engine Shutdown ---");
        sv.getEngine().shutdown();

        System.out.println("\n--- Engine Status ---");
        System.out.println("Engine running: " + sv.getEngine().isRunning());

        System.out.println("\n==================================");

        RemoteStartVehicle rv = new RemoteStartVehicle("Toyota", "Prius");

        System.out.println("\n--- Remote Start Vehicle Info ---");
        rv.showInfo();

        System.out.println("\n--- Starting Engine ---");
        rv.startEngine();

        System.out.println("\n--- Electric Status ---");
        rv.displayStatus();

        System.out.println("\n--- Energy Mode ---");
        System.out.println(rv.getEnergyMode());

        System.out.println("\n==================================");
        System.out.println("    System Loaded OK              ");
        System.out.println("==================================");
    }
}
