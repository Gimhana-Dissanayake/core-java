
// 1. public boolean addAll(Collection c):
// It can be used to add the elements of the specified Collection to the present
// Collection object

// If the elements are added successfully to the collection object then addAll()
// method will return true value.

// If the elements are not added succesfully to the collection then addAll()
// method will return false value.

// If atleast one element is added to the collection from the specified collection then addAll() method will return true value, if no element is added then only addAll() method will return false value.
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        System.out.println(hs.add("AAA")); // true
        System.out.println(hs.add("BBB")); // true
        System.out.println(hs.add("CCC")); // true
        System.out.println(hs.add("DDD")); // true
        System.out.println(hs);

        HashSet<String> hs1 = new HashSet<String>();
        System.out.println(hs1.add("XXX")); // false
        System.out.println(hs1.add("YYY")); // false
        System.out.println(hs1.add("ZZZ")); // false
        System.out.println(hs1);

        System.out.println(hs.addAll(hs1));
        System.out.println(hs);
        System.out.println(hs.addAll(hs1));
        System.out.println(hs);

        HashSet<String> hs2 = new HashSet<String>();
        System.out.println(hs2.add("XXX")); // false
        System.out.println(hs2.add("QQQ")); // false
        System.out.println(hs.addAll(hs2));
        System.out.println(hs);

    }

}