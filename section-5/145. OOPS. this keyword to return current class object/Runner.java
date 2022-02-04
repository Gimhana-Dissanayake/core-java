class A{
    public A getRef1(){
        A a = new A();
        return a;
    }

    public A getRef2(){
        return this;
    }
}


public class Runner{
    public static void main(String[] args){
        
        A a = new A();
        System.out.println(a);
        System.out.println();
        System.out.println(a.getRef1());
        System.out.println(a.getRef1());
        System.out.println(a.getRef1());
        //With regard to section here a new object 
        //is created when we call getRef1 method. 
        //This is not a good idea, as it can lead to 
        //stackoverflow problems


        System.out.println("----------------------------");

        //Current object will be returned here. On which reference variable we
        // called this getRef2 method that respective reference 
        //variable refered object is the current object.

        System.out.println(a.getRef2());
        System.out.println(a.getRef2());
        System.out.println(a.getRef2());
    }
}