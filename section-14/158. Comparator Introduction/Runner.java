// watch the lecture

// In general, TreeSet is able to allow only Comparable elements, because, TreeSet will access compareTo() method over the elments inorder to sort all the elements, because, Comparable interface is providing compareTo() method to the elements, bug, if we add non comparable element to TreeSet then TreeSet is trying to access compareTo() method, but, compareTo() method is not exsiting in non comparable elements, so interfal sorting logic of TreeSet is not working, in this context, if we want to sort non comparable elements then we have to define and we have to provide sorting logic explicitly to TreeSet, here to define and to provide sorting logic explicty to TreeSet we have to use 'java.util.Comparator'

// java.util.Comparator contains the following two methods.
// 1. public int compare(Object e1, Object e2)
// It will compare the provided two elements are in dictionary order a per ouer implementation

// If we want to use Comparator in Java applications then we have to use the following steps
// It will check whether two elements are equal or not.

// If we want to use Comparator in Java applications then we have to use the following steps.
// 1. Prepare an User defined class as an implmentation class to java.util.Comparator interface and provide implementation to compare() method.
// 2. Create ThreeSet Object and provide Comparator implementation to TreeSet:
// MyComparator mc = new MyComparator();
// TreeSet ts = new TreeSet(mc);
public class Runner {}
