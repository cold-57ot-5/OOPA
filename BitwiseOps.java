import java.util.Scanner;

public class BitwiseOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a & b = " + (a & b) + " (binary: " + Integer.toBinaryString(a & b) + ")");
        System.out.println("a | b = " + (a | b) + " (binary: " + Integer.toBinaryString(a | b) + ")");
        System.out.println("a ^ b = " + (a ^ b) + " (binary: " + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("a << 1 = " + (a << 1) + " (binary: " + Integer.toBinaryString(a << 1) + ")");
        System.out.println("a >> 1 = " + (a >> 1) + " (binary: " + Integer.toBinaryString(a >> 1) + ")");
    }
}
