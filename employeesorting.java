import java.util.*;
class Employee implements Comparable<Employee> {
    int id; String name; double salary;
    Employee(int id, String name, double salary){ this.id=id; this.name=name; this.salary=salary; }
    public int compareTo(Employee e){ return Double.compare(e.salary, this.salary); }

    public static void main(String[] args){
        List<Employee> list = Arrays.asList(
            new Employee(1,"A",30000), new Employee(2,"B",50000)
        );
        Collections.sort(list);
        list.forEach(e -> System.out.println(e.name+" "+e.salary));
        list.sort(Comparator.comparingDouble(e -> e.salary));
        Collections.reverse(list);
        list.forEach(e -> System.out.println(e.name+" "+e.salary));
    }
}
