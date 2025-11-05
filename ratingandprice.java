import java.util.*;
class Product {
    String name; double price, rating;
    Product(String n,double p,double r){name=n;price=p;rating=r;}
    public static void main(String[] args){
        List<Product> products = Arrays.asList(
            new Product("Phone",20000,4.5),
            new Product("Laptop",50000,4.5),
            new Product("Mouse",500,3.8)
        );
        products.sort((p1,p2)->{
            int cmp = Double.compare(p2.rating,p1.rating);
            return cmp!=0?cmp:Double.compare(p1.price,p2.price);
        });
        products.forEach(p->System.out.println(p.name+" "+p.price+" "+p.rating));
    }
}
