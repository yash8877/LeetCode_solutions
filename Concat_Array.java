public class Concat_Array {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 1 };
        int[] ans = getConcatenation(input);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
