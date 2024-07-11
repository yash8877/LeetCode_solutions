import java.util.Arrays;

public class Leetcode287 {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] check = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            if (check[nums[i]]) {
                return nums[i];
            }
            check[nums[i]] = true;
        }

        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,3,4,2,2};
        System.out.println(findDuplicate(num));
    }
}
