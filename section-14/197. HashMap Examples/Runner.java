import java.util.HashMap;

public class Runner {

  public static void main(String[] args) {
    // Hashmap is not following sorting and inserting order
    HashMap<String, String> trainers = new HashMap<String, String>();
    trainers.put("Sampath", "Java");
    trainers.put("Arun", "Python");
    trainers.put("Rahul", "C#");
    trainers.put("Malith", "Web development");
    trainers.put("Janaka", "C++");
    System.out.println(trainers);
    trainers.put("Janaka", "AWS");
    System.out.println(trainers);
    trainers.put("Malith", "RDMS");
    System.out.println(trainers);
    trainers.put(null, "NoSQL");
    trainers.put(null, "HTML");
    trainers.put("Kamal", null);
    trainers.put("Raj", null);
    System.out.println(trainers);

    HashMap trainers1 = new HashMap();
    trainers1.put("A", "AAA");
    trainers1.put("B", 200.4f);
    trainers1.put(12.45f, 10);
    System.out.println(trainers1);
  }
}
