// File: Q1_VehicleDemo.java
interface Vehicle {
    void start();
    void stop();
    String getFuelType();
}

class Car implements Vehicle {
    public void start() { System.out.println("Car started."); }
    public void stop() { System.out.println("Car stopped."); }
    public String getFuelType() { return "Petrol"; }
}

class ElectricBike implements Vehicle {
    public void start() { System.out.println("Electric Bike started."); }
    public void stop() { System.out.println("Electric Bike stopped."); }
    public String getFuelType() { return "Electric"; }
}

public class Q1_VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new ElectricBike() };
        for (Vehicle v : vehicles) {
            v.start();
            System.out.println("Fuel type: " + v.getFuelType());
            v.stop();
            System.out.println();
        }
    }
}
