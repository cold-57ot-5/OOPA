public class DataTypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 200;
        int i = 1000;
        long l = 123456789L;
        float f = 12.34f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        System.out.println("Byte: " + b + " | Size: " + Byte.SIZE/8 + " bytes");
        System.out.println("Short: " + s + " | Size: " + Short.SIZE/8 + " bytes");
        System.out.println("Int: " + i + " | Size: " + Integer.SIZE/8 + " bytes");
        System.out.println("Long: " + l + " | Size: " + Long.SIZE/8 + " bytes");
        System.out.println("Float: " + f + " | Size: " + Float.SIZE/8 + " bytes");
        System.out.println("Double: " + d + " | Size: " + Double.SIZE/8 + " bytes");
        System.out.println("Char: " + c + " | Size: " + Character.SIZE/8 + " bytes");
        System.out.println("Boolean: " + bool + " | Size: JVM dependent");
    }
}
