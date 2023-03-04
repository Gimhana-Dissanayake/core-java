// Enumeration:
// --------------------------------------
// it is an interface provided by JAVA in JDK1.0 version
// It is legacy cursor or legacy interator.
// It is applicable for all the legacy collections.
// To get enumeration object from collection object we ahve to use the following method.
// public Enumeration elements()
// Ex: Enumeration e = v.elements();

// When we create Enumeration object, automatically, all the elements of the vector will be copied to Enumeration object.

// When we create Enumeration object, automatically, a cursor or pointer will be created just before first element, by using this cursor only we are able to iterate elements form enumeration.

//To read elements from Enumeration we will use the following methods.
// 1. public boolean hasMoreElements():
// It will check whether more no of elements are existed or not form current cursor position.
// If atleast next Element is existed from the current Cursor position then it will return true value.
// If no next element is existed from current cursor position then it will return false value.

// 2. public Object nextElement():
// It will read next elment and it will move cursor to the next position.

public class Runner {}
// watch the lecture
