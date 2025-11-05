// File: Validation_NotEmptyDemo.java
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotEmpty {}

class Customer {
    @NotEmpty
    String name;

    Customer(String name) {
        this.name = name;
    }
}

public class Validation_NotEmptyDemo {
    public static void main(String[] args) throws Exception {
        Customer c1 = new Customer("");
        Customer c2 = new Customer("Divya");

        validate(c1);
        validate(c2);
    }

    static void validate(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        for (Field f : cls.getDeclaredFields()) {
            if (f.isAnnotationPresent(NotEmpty.class)) {
                f.setAccessible(true);
                String value = (String) f.get(obj);
                if (value == null || value.isEmpty()) {
                    System.out.println("Warning: Field '" + f.getName() + "' should not be empty.");
                }
            }
        }
    }
}
