import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println(list.remove(2));
        System.out.println(list);
        // System.out.println(list.get(10));//ArrayIndexOutOfBoundsException here
        // System.out.println(list.remove(10));//ArrayIndexOutOfBoundsException here
    }
}

// 4. public Object get(int index):

// It can be used to get an element existed at the specified index

// If the specified index value is existed in the list then the respective
// element will be returned.

// If the specified index value is not existed in the list then JVM will raise
// an Exception like "java.lang.IndexOutOfBoundsException"

// 5. public Object remove(int index):
// It can be used to remove an element existed at the specified index value.
// If the specified index value is not exisited in List then JVM will raise an
// Exception like. "java.lang.IndexOutOfBoundsException"
//
