public class Leetcode4 {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[n+i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2;
        int[] arr = {1,1,2,2};
        int[] res = shuffle(arr, n);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
