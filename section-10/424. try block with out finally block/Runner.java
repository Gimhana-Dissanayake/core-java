
// Q. Is it possible to write try block with out finally block?

// Ans:
// Yes, it is possible to write try block with out finally block but with catch
// block.

// try { ---instructions--- }catch(ExceptionName refVar){ ---instructions---}

// NOTE: In java applications, in try-catch-finally, catch block is optional, finally block is optional, we are able to write try block without catch block but with finallly block, we are able to write try block without finally block but with catch, we are unable to write try block withou both catchblock ad finally block, if we want to write try block then we must provide either catch or finallly or both catch and finally, if we want to write catcha nd finally along with try block then we must provide first catch then finally block

// try{
// }catch(Exception e){
// }
// Status: valid

// try{
// }finally{
// }
// Status: valid

// try{
// }catch(Exception refVar){}finally{
// }
// Status: valid

// try{
// }
// Status: Invalid

// try{
// }finally{
// }catch(ExceptionName refVar){
// }
//Status: Invalid

public class Runner {
    public static void main(String[] args) {
        System.out.println("Before try block");
        try {
            System.out.println("Inside try block, before exception");
            float f = 100 / 0;
            System.out.println("Inside try block, after exception");
        } catch (Exception e) {
            System.out.println("Inside catch block");
        }
        System.out.println("After try-catch blocks");
    }
}
