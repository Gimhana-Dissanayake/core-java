// Q. What are the difference between Comparable and Comparator?

// Ans:
//1. Comparable is an interface provided in java.lang.package.
//  Comparator is an interface provided in java.util.package.

// 2. Comparable interface has only one method.
// public int compareTo(Object obj)

// Comparator interface has two methods.
// public int compare(Object element1, Object element2)
// public boolean equals(Object element)

// 3. String class, all wrapper classes have implemented Comparable interface.

// No predifined class have implemented comparator interface.

// 4. Comprable interface is able to provide implicit sorting to TreeSet

// Comparator interface is able to  provide explicit sorting to TreeSet.

// 5. In case of Comparable, every element of TreeSet must have Sorting logic through compareTo() method.

// In case of Comparator, no element is requried to manage sorting login, we will define sorting logic explicitly and we will provide sorting logic to TreeSet explictly only one time.

// In general, Comparable is for the default natureal sorting order.

// In general, Comparator is for the customized sorting order.

public class Runner {}
