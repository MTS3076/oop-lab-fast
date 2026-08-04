package Lab08;
interface SmartDevice{
    void turnOn();
    void turnOff();
}
class SmartLight implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Light is turned On");
    }
    public void turnOff(){
        System.out.println("Smart Light is turned Off");
    }
}
class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Fan is turned On");
    }
    public void turnOff(){
        System.out.println("Smart Fan is turned Off");
    }
}
public class SmartHome {
    public static void main(String[] args) {
        SmartLight s1 = new SmartLight();
        SmartFan s2 = new SmartFan();
        s1.turnOn();
        s2.turnOn();
        s1.turnOff();
        s2.turnOff();
    }
}
