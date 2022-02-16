
enum Apple{
    A(500), B(300), C(100);

    int price;

    Apple(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

//the above code will be turned to below internally

// final class Apple extends java.lang.Enum<Apple> {
//     public static final Apple A = new Apple(500);
//     public static final Apple B = new Apple(300);
//     public static final Apple C = new Apple(100);
//     int price;
//    Apple(int price){

        //this.price = price;

    //}

//     public int getPrice(){
            //return price
//      }
//     
//   }

public class Runner {
    

    //Q) In java applications, is it possible to use enum as like classes
    // or 
    //In java applications, is it possible to declare normal variables, normal methods, normal contructors along with constant variables in side the enum

    //Ans:
    //Yes, it is possible to declare normal variables, normal methods, normal constructors along with constants variables inside the enum


    public static void main(String[] args){
        System.out.println("A Grade Apple : " + Apple.A.getPrice());

        System.out.println("B Grade Apple : " + Apple.B.getPrice());

        System.out.println("C Grade Apple : " + Apple.C.getPrice());
    }

}
