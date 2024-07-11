public class Leetcode1838 {
    public static int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        int max = 0, sum = 0, left = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum + k < nums[i] * (i - left + 1)) {
                sum -= nums[left++];
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }
}