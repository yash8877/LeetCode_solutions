import java.util.Arrays;

public class LeetCode3194 {
    public static double findAvg(int[] nums){
        int end = nums.length-1;
        int start = 0;
        Arrays.sort(nums);
        double avg = (nums[start] + nums[end])/2.0;
        while (start <= end) {
            avg = Math.min(avg, (nums[start] + nums[end])/2.0);
            start++;
            end--;
        }
        return avg;
        
    }
    public static void main(String[] args) {
        int[] num = {1,9,8,3,10,5};//1,3,4,4,7,8,13,15
        System.out.println(findAvg(num));
    }
}
