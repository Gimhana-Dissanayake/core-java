import java.util.*;

public class Runner {

    public static void main(String args[]) {
        List list = new ArrayList();
        list.add(10); // list.add(new Integer(10)) //autoboxing happens automatically
        list.add(20);
        list.add(30);

        System.out.println(list);

        // on each element toString() method is called when printing... [new
        // Integer(10).toString(), new Integer(20).toString()]

    }

}

// Collection Framework:
// ---------------------------

// Collection: Collection is an object, it is able to manage/ store/ represent a
// group of objects

// NOTE: Collection objects are not going to store another objects directly ,
// Collection objects are able to store refereces values of other objects.

// In Java applications, Collection objects are able to store only object
// reference values, they are not able to store primitive data directly.

// If we want to store primitive data in Collection object, first , we have to
// convert primitive data to Object form by using wrapper classes then we have
// to store objects in collection.
