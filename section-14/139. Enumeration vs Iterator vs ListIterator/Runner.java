// Q.What are the difference between Enumeration, Iterator, ListIterator?
// Ans:
// 1. Enumeration was introduced in JDK1.0 version. Iterator and ListIterator were introduced in JDK1.2 version.
// 2. Enumeration is Legacy Cursor.
// Iterator and ListIterator are not Legacy Cursors.
// 3. Enumeration is applicable for only legacy collections.
// Iterator is applicable for all thecollection implmenations.
// ListIterator is applicable for only List implementations.
// 4. Enumeration allows us to perform only read operation while iterating elements.
// Itertor allows us to perform read operation and remove operations while iterating elements.
// ListIterator allows us to perform read, replace, remove and insert operations while iterating elements.
// 5. Enumeration and Iterator are able to read elements in only forward direction.
// ListIterator allows us to iterate elements in both forward direction and backward direction

public class Runner {}
