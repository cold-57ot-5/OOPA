import java.util.*;
class Song implements Comparable<Song>{
    String title, artist; int duration;
    Song(String t,String a,int d){title=t;artist=a;duration=d;}
    public int compareTo(Song s){ return title.compareTo(s.title); }

    public static void main(String[] args){
        List<Song> songs = Arrays.asList(
            new Song("Believer","Imagine Dragons",204),
            new Song("Thunder","Imagine Dragons",190)
        );
        Collections.sort(songs);
        songs.forEach(s->System.out.println(s.title));
        songs.sort((s1,s2)->Integer.compare(s2.duration,s1.duration));
        songs.forEach(s->System.out.println(s.title+" "+s.duration));
    }
}
