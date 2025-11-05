import java.util.*;
class Salary {
    public static void main(String[] args){
        List<Double> salaries = Arrays.asList(25000.0, 35000.0, 45000.0);
        salaries.stream()
            .filter(s->s>=30000)
            .map(s->s*1.10)
            .forEach(System.out::println);
    }
}
