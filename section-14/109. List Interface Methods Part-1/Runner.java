import java.util.*;

public class Runner {

    // public void add(int index, Object element)
    // It can be used to add the specified element at the specified index.

    // If any element is existed at the specified index then the specified new
    // element will be inserted at the specified index and the existed element will
    // be adjusted to the next index, this operation is called as 'insert'
    // operation.

    // if the specified index value is the next value of the max index value of the
    // List then add() method will add the new element as last element, if the
    // specified index value is higher than the next value of the max index value of
    // the list then JVM will raise an exception like
    // "java.lang.IndexOutOfBoundsException"

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add(0, "AAA");
        list.add(1, "BBB");
        list.add(2, "CCC");
        list.add(3, "DDD");
        System.out.println(list);
        list.add(4, "EEE");
        System.out.println(list);
        // list.add(10, "ZZZ"); // Will give java.lang.IndexOutOfBoundsException
        // exception
        // System.out.println(list);

    }
}
