// 4. public boolean removeAll(Collection c)
// ---> It can be used to remove all the elements of the specified Collection from the present Collection. Object

// ---> If the remove operation is success then removeAll() method will return true value.

// ----> If the remove operation is failure then removeAll() method will return false value.

// If atleast one element is matched and if it is removed then removeAll() method will return true value, if no element is match and no element is removed then removeAll() method will return false value.

import java.util.ArrayList;

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
        System.out.println(al2);
        System.out.println(al1.removeAll(al2));
        System.out.println(al1);
        System.out.println(al1.removeAll(al2));
        System.out.println(al1);

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("EEE");
        al3.add("QQQ");
        System.out.println(al3);
        System.out.println(al1.removeAll(al3));
        System.out.println(al1);
    }

}