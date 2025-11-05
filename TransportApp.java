abstract class TransportBooking {
    abstract double calculateFare(double distance);

    void bookTicket() {
        System.out.println("Ticket booked successfully!");
    }
}

class BusBooking extends TransportBooking {
    double calculateFare(double distance) {
        return distance * 5; // ₹5 per km
    }
}

class TrainBooking extends TransportBooking {
    double calculateFare(double distance) {
        return distance * 3; // ₹3 per km
    }
}

class FlightBooking extends TransportBooking {
    double calculateFare(double distance) {
        return distance * 10 + 500; // base charge + ₹10 per km
    }
}

public class TransportApp {
    public static void main(String[] args) {
        TransportBooking b = new BusBooking();
        System.out.println("Bus Fare: ₹" + b.calculateFare(50));
        b.bookTicket();

        TransportBooking f = new FlightBooking();
        System.out.println("Flight Fare: ₹" + f.calculateFare(100));
        f.bookTicket();
    }
}
