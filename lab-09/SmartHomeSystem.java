package Lab09;


abstract class Appliance {
    abstract void turnOn();
}

interface VoiceControl {
    void executeCommand();
}

interface RemoteControl {
    void executeCommand();
}

class SmartLight extends Appliance implements VoiceControl, RemoteControl {

    public void turnOn() {
        System.out.println("Smart Light turned on.");
    }

    public void voiceCommand() {
        System.out.println("Voice Control: Light turned on via voice.");
    }

    public void remoteCommand() {
        System.out.println("Remote Control: Light turned on via remote.");
    }

    public void executeCommand() {
        voiceCommand();
        remoteCommand();
    }

    class Settings {
        void showSettings() {
            System.out.println("Displaying device settings.");
        }
    }

    public static void main(String[] args) {
        SmartLight s = new SmartLight();

        s.turnOn();
        s.executeCommand();

        SmartLight.Settings st = s.new Settings();
        st.showSettings();
    }
}
