// SortedSet:

// It was introduced in JDK1.2 version.
// It is a child interface to Set interface.
// It is not index based.
// It does not allowed intertion order.
// It follows sorted order.
// It allows Homogeneous elements, if we add different types of elements to SortedSet then JVM will raise an exception like java.lang.ClassCastException.
// It does not allow even single null element, if we add null element to SortedSet then JVM will raise an exception like java.lang.NullpointerException.
//It allows only Comparable elements, that is, the elements which implements java.lang.Comparable interface, if we add non comparable elements to SortedSet then JVM wiil raise an exception like java.lang.ClassCastException.
// If we want to add Non Comparable elements then we must use 'java.util.Comparator' interface.

// watch the lecture
public class Runner {}
