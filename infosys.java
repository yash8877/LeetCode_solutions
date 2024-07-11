import java.util.Scanner;

public class infosys {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch;
        System.out.println("Enter 'V' for the vegetarian and 'N' for the non-vegetarian: ");
        ch = s.nextLine();
        System.out.println("Enter the number of plates: ");
        int noplates = s.nextInt();
        System.out.println("Enter the distance(km): ");
        int numkm = s.nextInt();
        int count = 0;

        switch (ch) {
            case "V":
                if (noplates <= 0 && numkm == 0) {
                    System.out.println("Total bill is: -1");
                } else {
                    while (numkm >= 3) {
                        count += 1;
                        numkm--;
                    }
                    while (numkm > 6) {
                        count += 2;
                        numkm--;
                    }
                    System.out.println("Your total bill is: " + ((12 * noplates) + count));
                }
                break;
            case "N":
                if (noplates <= 0 && numkm == 0) {
                    System.out.println("Total bill is: -1");
                } else {
                    while (numkm > 3) {
                        count += 1;
                        numkm--;
                    }
                    while (numkm > 6) {
                        count += 2;
                        numkm--;
                    }
                    System.out.println("Your total bill is: " + ((15 * noplates) + count));
                }
                break;
            default:
                System.out.println("Total bill is: -1");
                break;
        }
    }

}

