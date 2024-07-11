import java.util.Scanner;

class Check {
    private int sum = 0, digit, count = 0;

    public int average(int num, int org) {
        while (num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num /= 10;
            count++;
        }

        System.out.println("Average of the " + org + " is: " + sum / count);
        return sum / count;

    }
}

public class AverageOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        int org = num;
        Check c1 = new Check();
        int avr = c1.average(num, org);
        int digit = 0, count = 0, min = 0;
        while (num > 0) {
            digit = num % 10;
            if (digit > avr) {
                count++;
            } else {
                min++;
            }
            num = num / 10;
        }
        System.out.println("Maximum is: " + count);
        System.out.print("Maximum is: " + min);

    }
}
