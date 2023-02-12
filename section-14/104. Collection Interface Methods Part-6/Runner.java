import java.util.ArrayList;

// 6. public boolean containsAll(Collection c)
// ----> This method can be used to check whether all the elements of the specified collection are existed or not in the present collection object
// -----> If all the elements of the specified collection are existed in the present collection object then containsAll() method will return true value.
// ------> If all the elements of the specified collection are not existed in the present collectino object then containsAll() method will return false value.

// If all elements of the specified collection are existed in the present collection then only containsAll() method will return true value, if atleast one element of the specified collection is not existed in the present collection object then containsAll() method will return false value.

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        System.out.println(al);

        ArrayList<String> a12 = new ArrayList<String>();
        a12.add("BBB");
        a12.add("CCC");
        System.out.println(a12);
        System.out.println(al.containsAll(al2)); // true

        ArrayList<String> a13 = new ArrayList<String>();
        al3.add("XXX");
        al3.add("YYY");
        al3.add("ZZZ");
        System.out.println(al3);
        System.out.println(al1.containsAll(al3)); // false

        ArrayList<String> al4 = new ArrayList<String>();
        al4.add("BBB");
        al4.add("CCC");
        al4.add("XXX");
        al4.add("YYY");
        System.out.println(al4);
        System.out.pritnln(al1.containsAll(al4));

    }
}
