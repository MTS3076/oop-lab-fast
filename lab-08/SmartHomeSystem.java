package Lab08;
abstract class Appliance{
   public void start(){
       System.out.println("Smart Device started");
   }
}
interface RemoteControl{
    void controlRemotely();
}
class SmartWashingMachine extends Appliance implements RemoteControl{
    @Override
    public void start(){
        System.out.println("Smart washing machine started");
    }
    public void controlRemotely(){
        System.out.println("Smart washing machine is controlled remotely");
    }
}
class SmartRefrigerator extends Appliance{
    @Override
    public void start(){
        System.out.println("Smart refrigerator started");
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
    SmartWashingMachine s1 = new SmartWashingMachine();
    SmartRefrigerator s2 = new SmartRefrigerator();
    s1.start();
    s1.controlRemotely();
    s2.start();
    }
}
