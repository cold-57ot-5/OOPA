import java.util.*;
import java.util.stream.*;
class Employee {
    String name, dept;
    Employee(String n,String d){name=n;dept=d;}
    public static void main(String[] args){
        List<Employee> list=Arrays.asList(
            new Employee("A","HR"), new Employee("B","IT"), new Employee("C","IT")
        );
        Map<String,Long> count = list.stream()
            .collect(Collectors.groupingBy(e->e.dept,Collectors.counting()));
        System.out.println(count);
    }
}
