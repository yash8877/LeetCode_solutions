import java.util.Arrays;
public class Leetcode1011 {
    public static int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().orElseThrow();
        int high = Arrays.stream(weights).sum();
        while (low <= high) {
            int mid = (low+high)/2;
            int daysRequired = daysRequ(weights, mid);
            if (daysRequired <= days) {
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static int daysRequ(int[] weights, int mid){
        int days = 1, load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > mid) {
                days = days + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    } 
    public static void main(String[] args) {
        int []weights = {1,2,3,1,1};
        int days = 4;
        System.out.println(shipWithinDays(weights, days));
    }
}
