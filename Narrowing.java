import java.util.Scanner;

public class Narrowing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        int i = (int) d; // explicit cast

        System.out.println("Double value: " + d);
        System.out.println("After narrowing to int: " + i);
    }
}
