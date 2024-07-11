import java.util.Scanner;
public class ChangesProblem {
    public
    static void verify(int nof1, int nof5,int tpa, int otpa){
        int ans=0 ,diff=0,position = 0;
        for (int i = 1; i <= nof5; i++) {
            ans = nof5 * i;
            if (ans < otpa && i <= nof5) {
                position = i;
                continue;
            }
            else
                diff = tpa - ans;
        }
        if (position <= nof5 && diff <= nof1) {
            System.out.println("**********************************");
            System.out.println("$1 notes needed: "+diff);
            System.out.println("$5 notes needed: "+position);
            System.out.println("**********************************");
        }
        else{
            System.out.println("-1");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOf$1, numOf$5, total_Amount, originalTotalAmount;
        System.out.print("Enter the number of $1: ");
        numOf$1 = sc.nextInt();
        System.out.print("Enter the number of $5: ");
        numOf$5 = sc.nextInt();
        System.out.print("Enter the total purchase amount: ");
        total_Amount = sc.nextInt();
        originalTotalAmount = total_Amount - numOf$1;

        ChangesProblem.verify(numOf$1, numOf$5, total_Amount, originalTotalAmount);

    }
}
