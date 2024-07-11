import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1, a2, a3;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        if (a1 == 60 && a2 == 60 && a3 == 60) {
            System.out.println("Triangle is equilateral");
        } else if ((a1 == a2 || a2 == a3 || a1 == a3) && (a1 == 90 || a2 == 90 || a3 == 90)) {
            System.out.println("Triangle is right isosceles");
        } else if (a1 == a2 || a2 == a3 || a1 == a3) {
            System.out.println("Triangle is isosceles");
        } else if (a1 == 90 || a2 == 90 || a3 == 90) {
            if (a1 + a2 + a3 == 180) {
                System.out.println("Triangle is right");
            } else {
                System.out.println("Not a Triangle");
            }
        } else if (a1 + a2 + a3 > 180) {
            System.out.println("Not a Triangle");
        } else {
            System.out.println("Triangle is not special");
        }
        sc.close();
    }
}
