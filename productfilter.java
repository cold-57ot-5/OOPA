import java.util.*;
import java.util.function.*;
class Item {
    String name; double price;
    Item(String n,double p){name=n;price=p;}
    public static void main(String[] args){
        List<Item> items=Arrays.asList(
            new Item("Pen",50),new Item("Bag",1200)
        );
        Predicate<Item> cheap=i->i.price<1000;
        Consumer<Item> show=i->System.out.println(i.name+" "+i.price);
        items.stream().filter(cheap).forEach(show);
    }
}
