
class Loan {
    float getIR() {
        return 5.0f;
    }
}

class GoldLoan extends Loan {
    float getIR() {
        return 7.5f;
    }
}

class StudentLoan extends Loan {
    float getIR() {
        return 12.5f;
    }
}

class CraftLoan extends Loan {
    // we want to reuse Super class getIR() method return value, so, it is not
    // required to override Loan class getIR() method.
}

public class Runner {

    public static void main(String[] args) {
        Loan goldLoan = new GoldLoan();
        System.out.println("Gold Loan IR  : " + goldLoan.getIR() + "%");

        Loan studyLoan = new GoldLoan();
        System.out.println("Study Loan IR  : " + studyLoan.getIR() + "%");

        Loan crafLoan = new GoldLoan();
        System.out.println("Gold Loan IR  : " + crafLoan.getIR() + "%");
    }

}
