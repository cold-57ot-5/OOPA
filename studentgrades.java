import java.util.*;
class Grades {
    public static void main(String[] args){
        List<Integer> scores = Arrays.asList(55, 65, 85);
        scores.stream()
            .filter(s->s>60)
            .map(s->s>=80?"A":s>=70?"B":"C")
            .forEach(System.out::println);
    }
}
