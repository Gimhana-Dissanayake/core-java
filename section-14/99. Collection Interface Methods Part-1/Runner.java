
// Collection:
// It is an interface provided by JAVA in its JDK1.2 version.
// If we want to represent a group of elements as single entity there we will
// use collection.
// Collection is a root interface, it has declared predefined methods common to
// all collection interface implementation classes.

// Collection interface Methods.
// 1. public boolean add(Object obj):
// It can be used to add the specified element to the Collection.
// It will return true value when the element is added successfully.
// It will return false value when the specified element is not added to the
// Collection.
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        System.out.println(hs.add("AAA")); // true
        System.out.println(hs.add("BBB")); // true
        System.out.println(hs.add("CCC")); // true
        System.out.println(hs.add("DDD")); // true
        System.out.println(hs);
        System.out.println(hs.add("BBB")); // false
        System.out.println(hs.add("CCC")); // false
        System.out.println(hs);

    }
}