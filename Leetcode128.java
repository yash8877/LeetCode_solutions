import java.util.Arrays;
import java.util.Stack;

public class Leetcode128 {
    public static int longestConsecutive(int[] nums) {
        Stack<Integer> store = new Stack<>();
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }
        int length = 1;
        int maxLength = 1;
        store.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] - nums[i-1] == 1) {
                store.push(nums[i]);
                length++;
                maxLength = Math.max(maxLength, length);
            }
            else{
                store.clear();
                store.push(nums[i]);
                length = 1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
