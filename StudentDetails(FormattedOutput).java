import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter Percentage: ");
        double percent = sc.nextDouble();

        System.out.printf("\n%-15s : %s\n", "Name", name);
        System.out.printf("%-15s : %d\n", "Roll Number", roll);
        System.out.printf("%-15s : %d\n", "Age", age);
        System.out.printf("%-15s : %c\n", "Gender", gender);
        System.out.printf("%-15s : %.2f%%\n", "Percentage", percent);
    }
}
