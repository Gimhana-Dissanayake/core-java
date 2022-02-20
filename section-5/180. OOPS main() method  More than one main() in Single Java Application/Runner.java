
//Q) It is possible to provide more than  one main() method in a single java application

//Ans:
//Yes,, it is possible to provide more than one main() method in single java application, but, not in single java class, but in multiple java classes.

//Q) In the above situation, is ti possible to access on main() from another main() method?

//Yes, it is possible to access one class main() method from aother class main()  method as liek a static method having String[] parameter

class A{
    public static void main(String[] args ){
        System.out.println("main()-A");
        String[] str =  {"AAA","BBB","CCC"};
        Runner.main(str);
        Runner.main(args);
    }
}

public class Runner {

   
    public static void main(String[] args ){
        System.out.println("main()-B");
    }
    
}
