public class Runner {

}
// Q) What is the difference between
// 1. printStackTrace() method
// 2. System.out.println(exceptionRef) or toString() and
// 3. getMessage() method?

// Ans:
// -----------------
// In general exception message is provided in the from of following three
// details.

// 1. Exception Name
// 2. Exception Descripton
// 3. Exception Location

// To display exeption details if we use printStackTrace() method then JVM will
// provide exception details like Exception Name, Excepton Description and
// Excetpion Location.

// To display excption details if we use system.out.println(e) then JVM will
// execute toString() is the respective exception class, initially toString()
// method was defined in Object class, it was implmented in sub a way to return
// a string contains "ClassName@RefValue", but, as per the Exception class
// requirement, almost all the exception classes have overridden object class
// toString() in such way that to return a string contains the exception details
// like Exception name and exception description

// To display Exception details, if we use getMesssage() method then JVM will
// return a string contains the Exception details like Exception Description
// public String getMessage();