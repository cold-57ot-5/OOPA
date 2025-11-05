import java.util.*;
import java.util.function.*;
class Student {
    String name; double marks;
    Student(String n,double m){name=n;marks=m;}
    public static void main(String[] args){
        List<Student> list=Arrays.asList(
            new Student("A",80),new Student("B",60)
        );
        Predicate<Student> highScore=s->s.marks>75;
        Consumer<Student> print=s->System.out.println(s.name+" "+s.marks);
        list.stream().filter(highScore).forEach(print);
    }
}
