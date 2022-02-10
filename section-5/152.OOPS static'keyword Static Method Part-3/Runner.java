public class Runner {
    
    //Q) Is is possible to display a line of text on command propmt with out using main() method?

    //Ans:
    //Yes, it is possible to display line of text on command prompt without using main() method, but, we have to use static varialbe and static method combination.


    
    static int i = m1();

    static int m1(){
        System.out.println("welcome to Java");
        System.exit(0);
        return 10;
    }


    //upto java 6 main method is optional but after java 7 onwards main method is manditory
}
