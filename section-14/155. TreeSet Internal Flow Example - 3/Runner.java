import java.util.TreeSet;

// watch the lecture
public class Runner {

  public static void main(String[] args) {
    TreeSet ts = new TreeSet<>();
    ts.add("DDD");

    ts.add("AAA"); //"AAA".compareTo("DDD"); -ve

    ts.add("EEE"); //"EEE".compareTo("DDD"); +ve

    ts.add("BBB"); //"BBB".compareTo("DDD"); -ve
    // "BBB".compareTo("EEE"); +ve

    ts.add("FFF"); //"FFF".compareTo("DDD");+ve
    //"FFF".compareTo("EEE");+ve

    ts.add("CCC"); //"CCC".compareTo("DDD");-ve
    //"CCC".compareTo("AAA");+ve
    //"CCC".compareTo("BBB");+ve

    ts.add("GGG"); //"GGG".compareTo("DDD");+ve
    // "GGG".compareTo("EEE");+ve
    // "GGG".compareTo("FFF");+ve

    System.out.println(ts); //[AAA, BBB,CCC,DDD,EEE,FFF,GGG]
  }
}
