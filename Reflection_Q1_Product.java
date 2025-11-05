// File: Reflection_Q1_Product.java
class Product {
    public void showDetails() {
        System.out.println("Product details shown.");
    }
}

public class Reflection_Q1_Product {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Product");
        Object obj = cls.getDeclaredConstructor().newInstance();
        cls.getMethod("showDetails").invoke(obj);
    }
}
