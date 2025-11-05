import java.util.*;

class Inventory {
    public static void main(String[] args) {
        ArrayList<Integer> quantities = new ArrayList<>();

        // Add product quantities
        quantities.add(10);
        quantities.add(20);
        quantities.add(15);

        // Update a specific index
        quantities.set(1, 25);

        // Display all quantities
        System.out.println("Product quantities: " + quantities);

        // Calculate total quantity
        int total = 0;
        for (int q : quantities) {
            total += q;
        }
        System.out.println("Total quantity: " + total);

        // Clear all entries
        quantities.clear();
        System.out.println("After clearing: " + quantities);
    }
}
