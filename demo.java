import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the digit: ");
        int num = in.nextInt();
        int orgnum = num;
        int highestDigit=0;
    
        while (num != 0) {
            int digit = num % 10;
            if (digit > highestDigit) {
                highestDigit = digit;
            }
            num /= 10;
        }
        
        System.out.println("Highest digit in " + orgnum + " is: " + highestDigit);
    }
}
