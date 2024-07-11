import java.util.Scanner;

public class Unit1Eventproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameEvent, eventType;
        int numOfPeople;
        char choose;
        double expenses;

        System.out.println("Enter the name of the event");
        nameEvent = sc.nextLine();
        System.out.println("Enter the type of the event");
        eventType = sc.nextLine();
        System.out.println("Enter the number of people expected");
        numOfPeople = sc.nextInt();
        System.out.println("Is it a paid entry? (Type Y or N)");
        choose = sc.next().charAt(0);
        System.out.println("Enter the projected expenses (in lakhs) for this event");
        expenses = sc.nextDouble();

        System.out.println("Event Name : "+nameEvent);
        System.out.println("Event Type : "+eventType);
        System.out.println("Expected Count : "+numOfPeople);
        System.out.println("Paid Entry : "+Character.toUpperCase(choose));
        System.out.println("Projected Expense : "+expenses+"L");
        sc.close();
    }
}
