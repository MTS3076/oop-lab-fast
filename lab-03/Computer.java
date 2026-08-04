package Lab03;

public class Computer {
    String systemId;
    String processorType;
    String ramSize;
    String operatingSystem;

    public Computer(){
        systemId="SYS-9F3A-72C1";
        processorType="Intel core i5";
        ramSize="16 GB";
        operatingSystem="Windows 11";
    }

    public Computer(String id,String p, String r, String os) {
        systemId = id;
        processorType = p;
        ramSize = r;
        operatingSystem = os;
    }

    public void display() {
        System.out.println("SystemId =" + systemId);
        System.out.println("Processor Type =" + processorType);
        System.out.println("Ram Size =" + ramSize);
        System.out.println("Operating System =" + operatingSystem);
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        Computer c2 = new Computer("SYS-A123", "Intel i7", "32 GB", "Windows 11");
        Computer c3 = new Computer("SYS-B456", "Ryzen 5", "16 GB", "Ubuntu");
        c1.display();
        c2.display();
        c3.display();
    }
}
