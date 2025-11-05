import java.util.*;
class AverageCalculator {
    public static <T extends Number> double findAverage(List<T> list) {
        double sum = 0;
        for (T n : list) sum += n.doubleValue();
        return sum / list.size();
    }

    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(10.5, 20.5, 30.0);
        System.out.println(findAverage(readings));
    }
}
