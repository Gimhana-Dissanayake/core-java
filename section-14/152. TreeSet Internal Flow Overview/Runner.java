// Q. How TreeSet is able to manage Sorting Order over the elements?

// Ans:
// To keep all the elements in sorting order, TreeSet will use the following two steps

// 1. Prepare Balance Tree with the elements of TreeSet.
// 2. Get elements as per in-Order Traversal.

// 1. Prepare Balanced Tree with the elements of TreeSet:
// When we add an element to TreeSet then TreeSet will follow the following algorithm internally

// 1. If the element is first element in TreeSet then make that element as Root node is Balanced Tree.

// 2. If the element is not first element then TreeSet will access compareTo() method on the provided new element by passing all the elements of Balanced Tree right from root node.

// If compareTo() method return +ve value then go and compare with right child by calling compareTo() method again, if no right child is existed for the present element in Balanced Tree then make the new element as Right child to the current element in Balanced Tree.

// If compareTo() method return -ve value then go and compare with left child of present element in Balanced Tree by accessing compareTo() again, if no left child is existed for the present element in balanced Tree then make the new element as left child to the present element in Balanced Tree.

// If CompareTo() method return 0 value then declare that the provided new element in a duplicate element then discard this new element in Balanced Tree.

// The above process must be repeated upto all the elements of TreeSet.

// 2. Get elements a per In-Order Traveral.

// After Constructuing balance Tree, we have to trace all the elements as per in-order traversal, that is, Left-Root-Right then we are able to get all the elements are per sorting order

public class Runner {}
