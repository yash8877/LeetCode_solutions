import java.util.Scanner;
public class Distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array: ");
        // int n = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        // System.out.println("Enter the elements......");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int maxFrequency = 0;
        int countMaxFrequency = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxFrequency) {
                maxFrequency = count;
                countMaxFrequency = 1;
            } else if (count == maxFrequency) {
                countMaxFrequency++;
            }
        }
        System.out.println("Output: " + countMaxFrequency);

    }
    
}