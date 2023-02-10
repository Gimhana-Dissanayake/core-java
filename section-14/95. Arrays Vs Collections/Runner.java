// Q. In java application, to store a group of other objects we have already arrays then what is the requirment to use collections?

// Ans: 
// 1. Arrays are available in fixed size nature, if we add any element to an array over its size then JVM will raise an exception like java.lang.ArrayIndexOutOfBoundsException.

// 2. Collection are dynamically growable in nature, even if we add element to the collection over its size then JVM will not raise any error, where JVM will add that new element to the collection by increasing the repecitve collection object size.

// Ex - ArrayList list = new ArrayList(3)
// list.add(new Student())
// list.add(new Student())
// list.add(new Student())
// list.add(new Student()) //---> No exception

// 3. Arrays are able to allow only Homogeneous elements, if we add any other element there we will get an error like 'Incompatible Type Error'

// EX: Student[] std = new Student[3]
// std[0] = new Student();
// std[1] = new Student();
// std[2] = new Customer() ---> Incompatible types error.

// Collection are able to allow Hterogeneous elements, that is, different types of elements.

// Ex: ArrayList al = new ArrayList();
// al.add(new Student())
// al.add(new Employee())
// al.add(new Customer())

// 4. No predefined library is existed for arrays to perform the operations like searching, sorting.... where developers have to define login explicitly

// Ex: String[] str = {"EEE","AAA","DDD", "BBB"}
// To sort, search the above array we need to prepare our own logic

// In case of collections, predefined library is exited to perform the operations like search and sorting...

// TreeSet ts = new TreeSet();
// ts.add("EEE")
// ts.add("AAA")
// ts.add("DDD")
// ts.add("BBB")
// ts.add("CCC")
// System.out.println(ts)

// Output ----> ["AAA","BBB","CCC","DDD","EEE"]

// 5. Arrays are not flexible to use in java applications, it has number of restrictions to use in java applications.Collections are more flexible to us in java applications, it has no restrictions to use in Java applications

// 6. If we know the no of elements which we want to represet at the time of writting program then it is good to use arrays, because, arrays are able to provide very good performance, when compared with collections. If we dont know the number of elements which we want to process at the time writing the program there it is good to use 'Collections' 

// 7. Arrays are less API dependent, so it is very simple to perform testing and debugging.Collections are more API dependent, so it is very difficult to perform testing and debugging.

// 8. Arrays are light weight, where collections are heavy weight

// 9. Arrays are able to improve Typedness, it allows Typesafe operations. Collections are able to reduce Typedenss in java applications, they are able to allow type unsafe operations.

public class Runner {

}
