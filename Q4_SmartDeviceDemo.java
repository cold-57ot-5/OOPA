// File: Q4_SmartDeviceDemo.java
interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
}

class SmartLight implements SmartDevice {
    private boolean isOn = false;
    public void turnOn() { isOn = true; System.out.println("Smart Light is ON."); }
    public void turnOff() { isOn = false; System.out.println("Smart Light is OFF."); }
    public String getStatus() { return isOn ? "ON" : "OFF"; }
}

class SmartFan implements SmartDevice {
    private boolean isOn = false;
    public void turnOn() { isOn = true; System.out.println("Smart Fan is ON."); }
    public void turnOff() { isOn = false; System.out.println("Smart Fan is OFF."); }
    public String getStatus() { return isOn ? "ON" : "OFF"; }
}

public class Q4_SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDevice[] devices = { new SmartLight(), new SmartFan() };
        for (SmartDevice d : devices) {
            d.turnOn();
            System.out.println("Status: " + d.getStatus());
            d.turnOff();
            System.out.println("Status: " + d.getStatus());
            System.out.println();
        }
    }
}
