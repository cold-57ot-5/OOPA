import java.util.*;
import java.util.stream.*;
class Student {
    String name, dept; int marks;
    Student(String n,String d,int m){name=n;dept=d;marks=m;}
    public static void main(String[] args){
        List<Student> list=Arrays.asList(
            new Student("A","CSE",80),
            new Student("B","ECE",70),
            new Student("C","CSE",90)
        );
        Map<String,Double> avg = list.stream()
            .collect(Collectors.groupingBy(s->s.dept, Collectors.averagingInt(s->s.marks)));
        System.out.println(avg);
    }
}
