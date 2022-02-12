
class A{



    private A(){
        System.out.println("A-Con");
    }

    void m1(){
        System.out.println("m1-A");
    }

    //Factory Method:
    //If any method returns an Object then that method is called as Factory Method.
    //EX:
    //Class c = Class.forName("A")
    //NumberFormat nf = NumberFormat.getInstance(1);
    //DateFormat df = DateFormat.getDateInstance(0,1);
    //ResourceBundle rb = ResourceBundle.getBundle(--);

    // 2. Instance Factory method
    //If any instance method returns an object reference value then that instance method is called as Instance factor method.

    //EX:
    // Majority of String class methods are instance factory methods.
    //String str = new String("Hello")
    //String str1 = str.concate("friend")
    //String str3 = str.toUpperCase()



   static A getRef(){//Factory Method
        A a = new A();
        return a;
    }
}

public class Runner {
    
    public static void main(String[] args){

        A a = A.getRef();

        a.m1();


    }

}
