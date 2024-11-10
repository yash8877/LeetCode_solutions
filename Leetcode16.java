import java.util.Arrays;

public class Leetcode16 {
    
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int ans = 1000;

        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = n-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                if (sum < 0) j++;
                else k--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
