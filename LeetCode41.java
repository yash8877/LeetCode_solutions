public class LeetCode41 {
    public static int firstMissingPositive(int[] nums) {
        boolean contains1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                contains1 = true;
            }
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = 1;
            }
        }
        if (contains1 == false) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                continue;
            }
            nums[index] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        int [] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
}
