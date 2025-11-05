import java.util.*;
import java.util.stream.*;
class Book {
    String title, author; double price, rating;
    Book(String t,String a,double p,double r){title=t;author=a;price=p;rating=r;}
    public static void main(String[] args){
        List<Book> books=Arrays.asList(
            new Book("Book1","A",200,4.5),
            new Book("Book2","B",300,3.9),
            new Book("Book3","C",150,4.8)
        );
        List<String> titles = books.stream()
            .filter(b->b.rating>4)
            .sorted(Comparator.comparingDouble(b->b.price))
            .map(b->b.title)
            .collect(Collectors.toList());
        System.out.println(titles);
    }
}
