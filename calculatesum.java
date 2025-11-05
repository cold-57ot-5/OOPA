import java.util.*;
class SumCalculator {
    public static double calculateSum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);
        System.out.println(calculateSum(nums));
    }
}
