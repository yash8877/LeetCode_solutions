import java.util.*;

public class loan_check {
    public static void loan_verifi(long la, int numEmis, int accountNumber, String lt, double sl) {

        switch (lt) {
            case "Car":
                if (sl > 25000 && la <= 500000 && numEmis <= 36) {
                    System.out.println("Success!! You are eligible");
                    System.out.println(accountNumber);
                    System.out.println(la);
                    System.out.println(numEmis);
                    System.out.println("Eligible loan amount: 500000");
                    System.out.println("No. of EMIs: 36");
 
                } else {
                    System.out.println("Sorry! You are not eligible for the loan.");
                }
                break;
            case "House":
                if (sl > 50000 && la <= 6000000 && numEmis <= 60) {
                    System.out.println("Success!! You are eligible");
                    System.out.println(accountNumber);
                    System.out.println(la);
                    System.out.println(numEmis);
                    System.out.println("Eligible loan amount: 6000000");
                    System.out.println("No. of EMIs: 60");
                } else {
                    System.out.println("Sorry! You are not eligible for the loan.");
                }
                break;
            case "Business":
                if (sl > 75000 && la <= 7500000 && numEmis <= 84) {
                    System.out.println("Success!! You are eligible");
                    System.out.println("Account number: "+accountNumber);
                    System.out.println("Loan Amount: "+la);
                    System.out.println("Number of EMIs: "+numEmis);
                    System.out.println("##################################");
                    System.out.println("Eligible loan amount: 7500000");
                    System.out.println("No. of EMIs: 84");
                } else {
                    System.out.println("Sorry! You are not eligible for the loan.");
                }
                break;
            default:
                System.out.println("Please enter a valid loan type!!!");
                break;
        }
    }

    // function for checking
    static void check(int an, double ac) {
        int count = 0, digit = 0;
        while (an != 0) {
            digit = an % 10;
            count++;
            an = an / 10;
        }
        if (count != 4 && digit != 1) {
            System.out.println("Not Valid!! Please enter 4 digit account number starting with 1");
        } else if (ac < 1000) {
            System.out.println("Sorry!!,Low Balance");
        }
    }

    public static void main(String[] args) {
        long loanAmount;
        double accountBalance, salary;
        int numEmis, accountNumber;
        String loantype;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        accountNumber = s.nextInt();
        System.out.print("Enter the account balance: ");
        accountBalance = s.nextDouble();
        System.out.print("Enter the salary: ");
        salary = s.nextDouble();
        System.out.print("Loan type: ");
        loantype = s.next();
        System.out.print("Enter the expected loan amount: ");
        loanAmount = s.nextLong();
        System.out.print("Enter the expected number of EMIs: ");
        numEmis = s.nextInt();

        loan_check.check(accountNumber, accountBalance);
        System.out.println("=======================================");
        loan_check.loan_verifi(loanAmount, numEmis, accountNumber, loantype, salary);
        System.out.println("=======================================");
    }
}
