abstract class FoodOrder {
    double totalAmount;

    // Abstract method — varies for each order type
    abstract void calculateTotal();

    // Concrete method — common for all types
    void generateBill() {
        System.out.println("Generating bill...");
        System.out.println("Total Amount: ₹" + totalAmount);
        System.out.println("Thank you for ordering!");
    }
}

class RestaurantOrder extends FoodOrder {
    double foodPrice = 500;
    double deliveryCharge = 50;

    void calculateTotal() {
        totalAmount = foodPrice + deliveryCharge;
    }
}

class CloudKitchenOrder extends FoodOrder {
    double basePrice = 400;
    double packagingFee = 30;

    void calculateTotal() {
        totalAmount = basePrice + packagingFee;
    }
}

public class Main {
    public static void main(String[] args) {
        FoodOrder f1 = new RestaurantOrder();
        f1.calculateTotal();
        f1.generateBill();

        FoodOrder f2 = new CloudKitchenOrder();
        f2.calculateTotal();
        f2.generateBill();
    }
}
