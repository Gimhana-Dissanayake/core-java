class A {

}

class Employee {

    String eid = "E-111";
    String ename = "Gimhana";
    float esal = 50000.0f;
    String eaddr = "Hyd";

    @Override
    public String toString() {

        System.out.println("Employee Details");
        System.out.println("-----------------");
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee name: " + ename);

        return "";
    }

}

public class Runner {
    public static void main(String[] args) {
        A a = new A();

        String ref = a.toString();
        System.out.println(ref);

        System.out.println(a.toString());

        System.out.println(a); // When we provide a reference variable to System.out.println method, internally
                               // JVM will call toString() method over the provided reference variable

        Employee b = new Employee();
        System.out.println(b);

        // Some predefined classes with their own toString() methods

        String str = new String("Gimhana Dissanayake");
        System.out.println(str);
        Integer in = new Integer(10);
        System.out.println(in);
        Exception e = new Exception("My own Exception");
        System.out.println(e);
        Thread t = new Thread();
        System.out.println(t);

    }
}
