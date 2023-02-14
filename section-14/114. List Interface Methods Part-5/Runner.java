import java.util.List;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");
        list.add(4, "c");
        System.out.println(list);
        System.out.println(list.indexOf("c"));
        System.out.println(list.lastIndexOf("c"));
        System.out.println(list.indexOf("z"));
        System.out.println(list.lastIndexOf("x"));
    }
}

// 6. public int indexOf(Object element):
// ---> It can be used to return an index value where the first occurence of the
// specified element is exsited

// ---> If the specified element is not present the indexOf method will return
// -1 value

// public int lastIndexOf(Object element);
// It will return an index value where the specified elements last occurence is
// existed.
// If the specified element is not present lastIndexOf method will return -1;