

// Q. Tell me the situation where we must use fully qulified name to the classes and interfaces?

// Ans. In java, Date is a classes which is present in both java.util and java.sql pakages


public class Runner {
    public static void main(String[] args){
        java.util.Date dt1 = new java.util.Date();
        System.out.println(dt1);
        java.sql.Date dt2 = java.sql.Date.valueOf("2020-12-12");
        System.out.println(dt2);
    }
}