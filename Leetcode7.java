public class Leetcode7 {
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= nums[i] && nums[j] != nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }   

    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        int[] ans = smallerNumbersThanCurrent(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
