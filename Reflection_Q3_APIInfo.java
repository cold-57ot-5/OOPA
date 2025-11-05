// File: Reflection_Q3_APIInfo.java
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface APIInfo {
    String endpoint();
    String method();
}

class UserAPI {
    @APIInfo(endpoint = "/users", method = "GET")
    public void getUsers() {}

    @APIInfo(endpoint = "/users", method = "POST")
    public void addUser() {}
}

public class Reflection_Q3_APIInfo {
    public static void main(String[] args) throws Exception {
        Class<UserAPI> cls = UserAPI.class;
        for (Method m : cls.getDeclaredMethods()) {
            if (m.isAnnotationPresent(APIInfo.class)) {
                APIInfo info = m.getAnnotation(APIInfo.class);
                System.out.println("Endpoint: " + info.endpoint() + " | Method: " + info.method());
            }
        }
    }
}
