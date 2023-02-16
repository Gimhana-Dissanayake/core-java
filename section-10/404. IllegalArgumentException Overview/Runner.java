
// IllegalArgumentException:
// In java applications, Thread is a flow of execution to perform a particular
// task, In Java, for each and every there thread there is a priority value, the
// default priority value for a thread is '5'.

// In java applications, if we want to set a particular priority value to the
// tread we will use the following method.
// public void setPriority(int priority)

// where priority value must be in the range from 1 to 10. 

// In the case, if we provide a priority value as a parameter to setPriority() which is not in the range from 1 to 10 then JVM will raise an exception like java.lang.IllegalArgumentException

public class Runner {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getPriority());
        t.setPriority(7);
        System.out.println(t.getPriority());
        t.setPriority(15);// illegalArgument exception here
    }
}
// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.IllegalArgumentException
// 2. Exception Description: blah blah blah....
// 3. Exception Location: line number