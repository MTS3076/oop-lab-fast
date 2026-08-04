package Lab07;

class SmartDevice {
    public void turnOn(){
        System.out.println("Smart Device is turned on");
    }
}
class SmartLight extends SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Smart Light is turned on");
    }
}
class SmartFan extends SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Smart Fan is turned on");
    }
}

class SmartAC extends SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Smart AC is turned on");
    }
}


public class SmartDeviceSystem{
    public static void main(String[] args) {
        SmartDevice s1 = new SmartLight();
        SmartDevice s2 = new SmartFan();
        SmartDevice s3 = new SmartAC();
        SmartDevice[] devices = new SmartDevice[3];
        devices[0]=s1;
        devices[1]=s2;
        devices[2]=s3;
        for(SmartDevice device :devices){
            device.turnOn();
        }

    }
}
