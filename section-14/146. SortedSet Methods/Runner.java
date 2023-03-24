import java.util.SortedSet;
import java.util.TreeSet;

// Methods:
// 1. public Object first():
// It will return first element of the SortedSet.

// 2. public Object last():
// It will return last  elements of the SortedSet

// 3. public SortedSet headSet(Ojbect element)
// It will return SortedSet contains all the elements which are less than the specified element.

// 4. publlic SortedSet tailsSet(Object element)
// It will return a SortedSet object contains all the elements which are greater than or equals to the specified element.

// 5. public SortedSet subSet(Object element1, Object elements2):
// It can be used to get a SortedSet object contains all the elements from the spcified first element[which included] and upto the specifided second element[which includes]

public class Runner {

  public static void main(String[] args) {
    SortedSet<String> ss = new TreeSet<String>();
    ss.add("FFF");
    ss.add("AAA");
    ss.add("EEE");
    ss.add("BBB");
    ss.add("DDD");
    ss.add("CCC");
    System.out.println(ss);
    System.out.println(ss.first());
    System.out.println(ss.last());
    System.out.println(ss.headSet("DDD")); //[AAA, BBB, CCC]
    System.out.println(ss.tailSet("DDD")); //[DDD, EEE, FFF]
    System.out.println(ss.subSet("BBB", "EEE")); //[BBB, CCC, DDD]
  }
}
