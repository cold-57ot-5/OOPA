import java.util.*;
class Sales {
    public static void main(String[] args){
        List<Integer> sales = Arrays.asList(1000,2000,3000);
        int total = sales.stream().reduce(0,Integer::sum);
        System.out.println(total);
    }
}
