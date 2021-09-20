class Runner {
    // If we want to use 'this' keyword to refer current class constructors then we have to use the following conditions.

    // 1. Always, 'this' statement must be first statement while referring current class  constructors.

    // 2. If we want to refer current class constructors by using 'this' keyword then we have to use the respective 'this' 
    //statement from the another current class constructor only, not from normal java methods. If we are trying to refer 
    //current class constructors by using 'this' keyword from normal java methods then compiler will raise an error.

    //Q. Is it possible to refer more than one current class constructors by using 'this' keyword from single current class constructor?

    //Ans: No, it is not possible to refer more than on current class construcotr from single current class 
    //constructor by using 'this' keyword, because, if we are trying to refer more than one current class construcotrs by using "this"
    // keyword  then we have to profvide more than one time 'this' statement, where only one statment is acting as first statement and the
    // remaining 'this' statements are acting as second, third,...statements.

    public static void main(String[] args){

    }



}

class A{
    A(){
        
        System.out.println("A-con");
        //this(10); this gives an error because of point one above
    }

    A(int i){
      
        System.out.println("A-int-param-con");
    }

    void m1(){
        //this(10); This give an error because of point two above
        System.out.println("m1");
    }

}
