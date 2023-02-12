import java.util.ArrayList;

// 7. public boolean retainAll(Collection c)
// It can be used to remove all the elements from the present Collection object except the elements which are matched with the elements existed in the specified collection object 

// If atleast one element is removed from present Collection object then retainAll() method will return true value.

// If no element is removed from present Collection object then retainAll() method will return false value.

// watch this lecture again

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("AAA");
        al1.add("BBB");
        al1.add("CCC");
        al1.add("DDD");
        al1.add("EEE");
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("BBB");
        al2.add("CCC");
        al2.add("DDD");
        System.out.println(al2);
        System.out.println(al1.retainAll(al2));
        System.out.println(al1);

        ArrayList<String> al4 = new ArrayList<String>();
        al4.add("BBB");
        al4.add("CCC");
        al4.add("DDD");
        System.out.println(al4);
        System.out.println(al1.retainAll(al4));
        System.out.println(al1);

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("PPP");
        al3.add("QQQ");
        System.out.println(al3);
        System.out.println(al1.retainAll(al3));
        System.out.println(al1);
    }
}
