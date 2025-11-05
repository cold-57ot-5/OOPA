import java.util.*;
class ProductSort {
    String name; double price, rating;
    ProductSort(String n,double p,double r){name=n;price=p;rating=r;}
    public static void main(String[] args){
        List<ProductSort> list=Arrays.asList(
            new ProductSort("TV",30000,4.7),
            new ProductSort("Phone",15000,4.7),
            new ProductSort("Earbuds",2000,4.1)
        );
        list.sort((p1,p2)->{
            int cmp=Double.compare(p2.rating,p1.rating);
            return cmp!=0?cmp:Double.compare(p1.price,p2.price);
        });
        list.forEach(p->System.out.println(p.name+" "+p.price+" "+p.rating));
    }
}
