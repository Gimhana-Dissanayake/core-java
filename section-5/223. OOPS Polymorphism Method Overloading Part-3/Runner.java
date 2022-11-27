
class Employee {
    void generateSalary(int basic, float hk, int ta, float pf) {
        System.out.println("Salary is calculated on the basis of Basic, HK, TA, PF");

    }

    void generateSalary(int basic, float hk, int ta, float pf, int bonus) {
        System.out.println("Salary is calculated on the basis of Basic, HK, TA, PF and Bonus");

    }
}

public class Runner {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.generateSalary(250000, 25.0f, 6000, 12.5f);
        emp.generateSalary(250000, 25.0f, 6000, 12.5f, 1000);
    }

}