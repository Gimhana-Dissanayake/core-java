class Runner{
    //If we want to refer current class constructor by using 'this' keyword then we have to use the following syntax


   // this([param_list]);

   //this();v --> 0-arg constructor in current class
   //this(10); --> int-param constructor in current class
   //this(10,20); --> int, int parameterized constructor in current class

   public static void main(String[] args){
       A a = new A();

   }

   

}

class A{
    A(){
        this(10);
        System.out.println("A-con");
    }

    A(int i){
        this(22f);
        System.out.println("A-int-param-con");
    }

    A(float f){
        this(245.34);
        System.out.println("A-float-param-Con");
    }

    A(double d){
        System.out.println("A-double-param-con");
    }
    //whenever constructor names are same and parameter list is different, this is called constructor overloading.

    //Constructor chaining - It is the process of executing all the current class constructors in a chain fashion by using this keyword. This program is an example of that
}

