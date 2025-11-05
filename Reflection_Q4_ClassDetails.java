// File: Reflection_Q4_ClassDetails.java
import java.lang.reflect.*;

class Employee {
    int id;
    String name;

    public void display() {}
    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
}

public class Reflection_Q4_ClassDetails {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Employee");

        System.out.println("Fields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f.getType().getSimpleName() + " " + f.getName());
        }

        System.out.println("\nMethods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName() + "()");
        }
    }
}
