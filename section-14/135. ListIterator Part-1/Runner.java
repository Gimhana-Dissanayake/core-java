public class Runner {}
// It is an interface provided by JAVA in its JDK1.2 version.
// It is not Legacy Cursor.
// It allows us to perform the operations like read, insert, replace and remove operations while iterating elements.
// It allows us to iterate elements in both  forward direction and backward direction.
// It is applicable for only list implementations.
// To get ListIterator object we have to use the following method form List implementations.
// public ListIterator listIterator()
// To iterate elements in forward direction we have to use the following methods from ListIterator.
// 1. public boolean hasNext():
// ---> It will check whether next element is existed or not form the current cursor position.
// ---> If next element is existed then it will return true value.
// ---> If no next element from current cursor position then it will return false value.
// 2. public Object next():
// ----> It will read next element and it will move cursor to next position in forward direction.
// 3.public int nextIndex():
// It will return index value fo the next elment
// To iterate the elements in backward direction then we ahve to use the following methods.
// 1. public boolean hasPrevious();
// ---> It can be used to check whether previous element is existed or not from the current cursor position.
// It will return true value when previous element is existed.
// It will return false value when no previous elment is existed.
// 2. public Object previous():
// It able to read previous element and it will move cursor to next position in backward direction.
// 3. public int previousIndex():
// It will return an index value of the previous element.
// To perform the operations like insert, replace, remove we have to us the following methods.
// 1. Public void add(Object elment):
// It will insert the specified element at current cursor position.
// 2. public Object set(Object element):
// It will replace the current element with the specified new element
// 3. public void remove(Object element):
// It will remove a particular element from the collection[Listimplementations]
