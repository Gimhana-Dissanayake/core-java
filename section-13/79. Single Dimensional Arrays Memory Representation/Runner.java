public class Runner {

}

// In java applications, when we pass array reference varialbe as parameter to
// System.out.println() method then JVM will access internally toString()
// method, where all arrays are having their own toString() method internally,
// they are not depending on the object class toString() method, they will
// return a string contains the fallowing format

// 1. Single Dimentional Array: [ArrayDataType@RefValue
// 2. Two Dimentional Array: [[ArrayDataType@RefValue
// 3. Three Dimentional Array: [[[ArrayDataType@RefValue