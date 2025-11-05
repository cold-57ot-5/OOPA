public class Widening {
    public static void main(String[] args) {
        int a = 25;
        long b = a;         // int to long
        float c = b;        // long to float

        System.out.println("int value: " + a);
        System.out.println("long value: " + b);
        System.out.println("float value: " + c);
    }
}