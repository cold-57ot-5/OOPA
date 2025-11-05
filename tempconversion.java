import java.util.*;
class Temperature {
    public static void main(String[] args){
        List<Double> temps = Arrays.asList(25.0, 32.0, 35.0);
        temps.stream()
            .filter(t->t>30)
            .map(t->(t*9/5)+32)
            .forEach(System.out::println);
    }
}