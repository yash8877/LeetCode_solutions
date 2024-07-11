public class Leetcode198 {
    public static int rob(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int num []= {1,2,3,1};
        System.out.println(rob(num));
    }
}
