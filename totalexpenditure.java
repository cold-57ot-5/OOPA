import java.util.*;
class Expenses {
    public static void main(String[] args){
        List<Double> exp = Arrays.asList(1200.5,2300.0,1500.75);
        double total = exp.stream().reduce(0.0,Double::sum);
        System.out.println(total);
    }
}
