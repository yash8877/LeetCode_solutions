public class Leetcode6 {
    public static int numIdenticalPairs(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            int n = 0;
            for (int j = i; j < nums.length-1; j++) {
                if (nums[i] == nums[j+1]) {
                    n++;
                }
            }
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
