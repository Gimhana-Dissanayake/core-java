
class AA{

    //In java applications, if we want to access current class methods then it is not required to create object and it isnot required to use any reference variable and any special keyword, directly, we can access current class methods

    void m1(){
        System.out.println("m1-A");
        m2();
        this.m2(); //Jvm searchs for m2 method in current class
    }
    void m2(){
        System.out.println("m2-A");
    }
}

public class Runner {
public static void main(String[] args){
    AA a = new AA();
    a.m1();
}
}
