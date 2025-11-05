// File: Reflection_Q2_APIDescription.java
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface APIDescription {
    String description();
}

@APIDescription(description = "Handles product APIs")
class ProductAPI {
    @APIDescription(description = "Fetches all products")
    public void getProducts() {}
}

public class Reflection_Q2_APIDescription {
    public static void main(String[] args) throws Exception {
        Class<ProductAPI> cls = ProductAPI.class;

        if (cls.isAnnotationPresent(APIDescription.class)) {
            APIDescription classAnno = cls.getAnnotation(APIDescription.class);
            System.out.println("Class: " + cls.getSimpleName() + " - " + classAnno.description());
        }

        for (Method m : cls.getDeclaredMethods()) {
            if (m.isAnnotationPresent(APIDescription.class)) {
                APIDescription methodAnno = m.getAnnotation(APIDescription.class);
                System.out.println("Method: " + m.getName() + " - " + methodAnno.description());
            }
        }
    }
}
