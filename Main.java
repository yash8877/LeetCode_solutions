import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String studentName;
    private int registerNumber;
    private static int noOfStudents = 0;

    public Student(String studentName, int registerNumber) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        noOfStudents++;
    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }

    public void displayDetails(int studentIndex) {
        System.out.println("\nDetails of student " + studentIndex + " :");
        System.out.println("Register Number : " + registerNumber);
        System.out.println("Name : " + studentName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<NPTL> students = new ArrayList<>();

        String choice;
        do {
            System.out.println("Enter the student details:");
            System.out.println("Enter the register number:");
            int registerNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline character left by nextInt()
            System.out.println("Enter the name:");
            String studentName = scanner.nextLine();

            students.add(new NPTL(studentName, registerNumber));

            System.out.println("Do you want to continue [Yes/No]:");
            choice = scanner.nextLine().trim();
        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Number of Students are : " + NPTL.getNoOfStudents());

        for (int i = 0; i < students.size(); i++) {
            students.get(i).displayDetails(i + 1);
        }

        scanner.close();
    }
}

