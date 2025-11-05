import java.util.*;
class Athlete implements Comparable<Athlete>{
    String name,country; int score;
    Athlete(String n,String c,int s){name=n;country=c;score=s;}
    public int compareTo(Athlete a){return name.compareTo(a.name);}

    public static void main(String[] args){
        List<Athlete> list=Arrays.asList(
            new Athlete("Zane","USA",90),
            new Athlete("Aria","UK",95)
        );
        Collections.sort(list);
        list.forEach(a->System.out.println(a.name));
        list.sort((a1,a2)->Integer.compare(a2.score,a1.score));
        list.forEach(a->System.out.println(a.name+" "+a.score));
    }
}
