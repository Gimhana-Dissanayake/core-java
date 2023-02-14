import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Employee Number: ");
            int eno = Integer.parseInt(br.readLine());

            System.out.print("Employee Name: ");
            String ename = br.readLine();

            System.out.print("Employee Salary: ");
            float esal = Float.parseFloat(br.readLine());

            System.out.print("Employee Address: ");
            String eaddr = br.readLine();

            System.out.println("Employee Details: ");
            System.out.println("------------------------------------");
            System.out.println("Employee Number: " + eno);
            System.out.println("Employee Name: " + ename);
            System.out.println("Employee Salary: " + esal);
            System.out.println("Employee Address: " + eaddr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
