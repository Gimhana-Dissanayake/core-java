import java.util.ArrayList;

// 5. Public boolean contains(Object obj):
// -----> It can be used to check whether the specified element is existed in the present Collection object or not.
// -----> If the specified element is existed in the present Collection then contains() method will return 'true' value.
// -----> If the specified element is not existed in the present Collection object then contains() method will return  false value.

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        al.add("EEE");
        System.out.println(al);
        System.out.println(al.contains("BBB")); // true
        System.out.println(al.contains("DDD")); // true
        System.out.println(al.contains("ZZZ")); // false

    }
}
