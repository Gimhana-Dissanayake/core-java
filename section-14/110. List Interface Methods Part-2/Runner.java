
import java.util.*;

public class Runner {

    // public void addAll(int index, Collection c):
    // It can be used to add all the elements of the specified Collection to the
    // present Collection object.

    // If the specified index value is higher the next index of max index of the
    // list then JVM will raise an exception like
    // java.lang.IndexOutOfBoundsException.

    // If The specified index value is exsited already in the List then all the
    // elements of the specified collection are inserted at the specified index and
    // the existed elements will be adjusted to the next index values.

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add(0, "AAA");
        list1.add(1, "BBB");
        list1.add(2, "CCC");
        list1.add(3, "DDD");
        System.out.println(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("XXX");
        list2.add("YYY");
        list2.add("ZZZ");
        System.out.println(list2);

        list1.addAll(2, list2);
        System.out.println(list1);
        System.out.println("Size " + list1.size());

        List<String> list3 = new ArrayList<String>();
        list3.add("RRR");
        list3.add("TTT");

        // list1.addAll(9, list3); //This line of code will give
        // java.lang.IndexOutOfBoundsException
    }

}
