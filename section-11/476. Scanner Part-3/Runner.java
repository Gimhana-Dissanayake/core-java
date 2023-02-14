import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            System.out.println("Employee Number : ");
            int eNo = s.nextInt();
            System.out.println("Employee Name : ");
            String eName = s.next();
            System.out.println("Employee Salary: ");
            float eSal = s.nextFloat();
            System.out.println("Employee Address : ");
            String eAddr = s.next();

            System.out.println("Employee Details: ");
            System.out.println("------------------------------------");

            System.out.println("Employee Number: " + eNo);
            System.out.println("Employee Name: " + eName);
            System.out.println("Employee Salary: " + eSal);
            System.out.println("Employee Address: " + eAddr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
