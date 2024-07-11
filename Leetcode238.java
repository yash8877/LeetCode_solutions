import java.util.ArrayList;

public class Leetcode238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        int suffix = 1;
        for (int i = n-1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] ans = productExceptSelf(num);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
