public class FinalVariableTest {
    public static void main(String[] args) {
        final int number = 10;
        System.out.println("Original value: " + number);

        // Uncommenting the below line will cause a compile-time error
        // number = 20;  // Error: cannot assign a value to final variable number

        System.out.println("After modification attempt: not possible due to final keyword.");
    }
}