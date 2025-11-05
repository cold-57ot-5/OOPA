class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car runs on petrol or diesel.");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.move();      // inherited from Vehicle
        c.fuelType();  // specific to Car
    }
}
