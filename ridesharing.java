import java.util.*;
class Driver {
    String name; double rating, distance;
    Driver(String n,double r,double d){name=n;rating=r;distance=d;}
    public static void main(String[] args){
        List<Driver> drivers = Arrays.asList(
            new Driver("A",4.9,2.0),
            new Driver("B",4.9,1.5),
            new Driver("C",4.5,3.0)
        );
        drivers.sort((d1,d2)->{
            int cmp=Double.compare(d2.rating,d1.rating);
            return cmp!=0?cmp:Double.compare(d1.distance,d2.distance);
        });
        drivers.forEach(d->System.out.println(d.name+" "+d.rating+" "+d.distance));
    }
}
