import java.util.*;
import java.util.function.Consumer;

class Movie {

  String name;
  String hero;
  String heronie;

  public Movie(String name, String hero, String heronie) {
    this.name = name;
    this.hero = hero;
    this.heronie = heronie;
  }
}

public class Runner {

  public static void main(String[] args) {
    ArrayList<Movie> al = new ArrayList<Movie>();

    populate(al);

    Consumer<Movie> c = m -> {
      System.out.println(
        "Movie Name : " +
        m.name +
        " | Hero name : " +
        m.hero +
        " | Heroine " +
        m.heronie
      );
    };

    for (Movie m : al) {
      c.accept(m);
    }
  }

  static void populate(ArrayList<Movie> list) {
    list.add(new Movie("Spiderman", "Peter", "none"));
    list.add(new Movie("Batman", "Bruce", "none"));
    list.add(new Movie("The Godfather", "Vito corleone", "none"));
    list.add(new Movie("Load of The Rings", "Frodo", "Elf queen"));
    list.add(new Movie("Babies Day Out", "The baby", "none"));
  }
}
