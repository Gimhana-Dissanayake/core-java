

//Q what is the requirment to provide String data type as parameter to main() method
//Ans - to accomodate many types of input we use String type coz any data type can be converted to string type


//Q What is the requriemtn to provide array type as parameter to the main() method
//Ans - to get many inputs

public class Runner {
    
    public static void main(String[] args){
        System.out.println("No of command line arguments : " + args.length);
        System.out.println("List of command line arguments: ");
        for(int i = 0; i< args.length;i++){
            System.out.println(args[i] + " ");
        }
    }

}
