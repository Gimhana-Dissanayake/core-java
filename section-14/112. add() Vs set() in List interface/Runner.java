import java.util.*;

public class Runner {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");
        System.out.println(list);
        list.add(2, "panda");
        System.out.println(list);
        // list.add(10, "z");// here we will get java.lang.IndexOutOfBoundsException
        // list.set(10,"p");// here we will get java.lang.IndexOutOfBoundsException
        System.out.println(list.set(2, "monkey"));
        System.out.println(list);
    }

}

// Q) What is the difference between add() method and set() method in List
// interface?

// Ans:

// public void add(int index, Object element): In List implmentaions, add()
// method is able to add the element at the
// specified index value, if the index value is same as size of the list then
// element will be added to the list at last element. If the specified index
// value is greater than the size of the List then JVM will raise an Exception
// like java.lang.IndexOutOfBoundsException. If the index value is exsisted in
// the list then add() method will add new element at the specified index and
// the existed element will be adjusted to the next index value.

// NOTE: add() is able to perform 'insert' operation.

// public Object set(int index, Object element):
// It can be used to add the specified element at the specified index value, if
// the specified index is not existed in List then JVM will raise an exception
// "java.lang.IndexOutOfBoundsException", if the specified index is existed in
// the List the set() method will remove the existed element and set() method
// will
// add the specified new element at the specified index value and it will return
// the removed elmeent from set() method.

// NOTE: set() method is able to perform replace or Override operation.