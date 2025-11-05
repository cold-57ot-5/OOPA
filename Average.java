import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double avg = (a + b + c) / 3;  // Precedence ensures + before /
        System.out.println("Average = " + avg);
    }
}
