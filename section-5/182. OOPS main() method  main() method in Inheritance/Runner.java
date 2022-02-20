
//Q) If we provide main() method in super class then is it possible to execute main() method through the respective sub class

//Ans:
//Yes, it is possible to acces super class main() method through sub class name by JVM

//Q)Is it possible to provide main() method inside an inner class

//Ans:

//Yes, it is possible to provide main() method inside an inner class, but, the respective inner class must be static inner class

//Q)What is this main() method? It it a predifined method? or is it user defined method

//Ans:
//main() method is not predefined method and it is not user defined method, but, it is a conventional method with fixed prototype and with user defined implementation.

class A{
    public static void main(String[] args){
        System.out.println("main()-A");
    }
}

class Outer{
    static class Inner{
        public static void main(String[] args){
            System.out.println("main()-Inner");
        }
    }
}

public class Runner extends A {
    
}
