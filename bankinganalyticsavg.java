import java.util.*;
class TransactionAnalytics {
    public static <T extends Number> double avgTransaction(List<T> list) {
        double sum = 0;
        for (T n : list) sum += n.doubleValue();
        return sum / list.size();
    }

    public static void main(String[] args) {
        List<Integer> transactions = Arrays.asList(1000, 2000, 3000);
        System.out.println(avgTransaction(transactions));
    }
}
