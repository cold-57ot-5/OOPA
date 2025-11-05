import java.util.*;
import java.util.function.*;
class User {
    String name; int steps;
    User(String n,int s){name=n;steps=s;}
    public static void main(String[] args){
        List<User> users=Arrays.asList(
            new User("A",12000), new User("B",8000)
        );
        Predicate<User> active=u->u.steps>10000;
        Consumer<User> display=u->System.out.println(u.name+" "+u.steps);
        users.stream().filter(active).forEach(display);
    }
}
