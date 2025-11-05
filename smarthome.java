class Appliance {
    void turnOn() {
        System.out.println("Appliance turned on.");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating.");
    }
}

class CeilingFan extends Fan {
    void setSpeed(int speed) {
        System.out.println("Ceiling fan speed set to " + speed);
    }

    public static void main(String[] args) {
        CeilingFan cf = new CeilingFan();
        cf.turnOn();    // from Appliance
        cf.rotate();    // from Fan
        cf.setSpeed(3); // from CeilingFan
    }
}
