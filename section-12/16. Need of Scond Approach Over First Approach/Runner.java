
// watch the lecture again
public class Runner {

}
// Q. In java applications, we have already first approach[Extending Thread
// class] to create threads then what is the requirement to go for second
// approach[implementing Runnable interface] of create threads

// Ans:
// In First Approach:
// class MyClass extends Thread{}
// In GUI app
// class My class extends Frame{}
// In java app.
// class MyClass extends Frame, Thread{}//Because this is not possible due to
// mulitple inheritance being not supported by java we have to use the second
// approach to create threads.

// NOTE: Single sub class is exteded from more than one super class directly, it
// represents multiple inheritance, it is not supported by java.if we use first
// approach to craete threads then we must extend java.lang.Thread class to user
// defined class, it is not possible to extend any other classes to user defined
// class.

// To overcome the above problem, we have to use second approach tocreate
// threads.

// In second approach of creating threads we will implmeent Runnable nterface
// instead of extending Thread class.

// class MyClass extends Frame implements Runnable{}