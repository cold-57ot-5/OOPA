import java.util.*;
class Distance {
    public static void main(String[] args){
        List<Integer> km = Arrays.asList(50,80,70);
        int total = km.stream().reduce(0,Integer::sum);
        System.out.println(total);
    }
}
