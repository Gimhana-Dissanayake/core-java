public class Runner {

}

// try-catch-finally:
// 'throws' keyword is not really an exception handler, because 'throws' keyword
// is not handling exceptions, just, it will bypass the generaged exception from
// present method to the caller of that method inorder to handle at caller
// method.

// In java applications, if we want to handle the exception at the location
// where it was generated there we will use "try-catch-finally".

// Syntax:

// try { ---- }catch(ExceptionName refVar){-----instructions----}finally{
// ----instructions---- }

// try block:
// try block is able to include a set of instructions[Not complete
// program][Doubtfull code] which may raise an exception.

// ---> In try-catch-finally syntax, try block[the instructions which provided
// inside try block] is not giving any guarante to raise the exception

// ---> in try block, if we are not getting exception then JVM will execute the
// omplete try block, at the end of try block, JVM will bypass flow of execution
// to finally block by skipping catch block.

// ---> In try block, if we are getting an exceptionn then JVM will create the
// respective exception object, JVM will bypass flow of execution to catch block
// by skipping all the remaining instructions in try block, here along with flow
// of execution JVM will pass the generated exception object reference value as
// parameter to catch block inorder to display exception details.