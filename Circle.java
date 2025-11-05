import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;  // constant using final

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        double area = PI * r * r;
        double circumference = 2 * PI * r;

        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
}