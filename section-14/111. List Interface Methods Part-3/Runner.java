// public object set(int index, Object element)

// It can be used to add the specified element at the specified index.

// If the specified index in not existed in the List then JVM will raise an exception like "java.lang.IndexOutOfBoundsException".

// If the specified index is existed in the List then set() method will remove the existed element and set() method will add the specified new element at the specified index and set() method will return the removed element, this operation is called as 'override' or 'replace' operation.

// 

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");
        System.out.println(list);
        // list.set(4,e);//index out of bounds exception occures here
        list.set(2, "panda");
        System.out.println(list);

        System.out.println("--------------");

        System.out.println("removed: " + list.set(2, "ant"));
        System.out.println(list);

    }

}
