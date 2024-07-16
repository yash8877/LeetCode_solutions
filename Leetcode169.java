public class Leetcode169 {
    public static int majorityElement(int[] nums){
        int n = nums.length;
        int times = n / 2;
        int count = 0,element = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            }
            else if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                cnt++;
            }
        }
        if (cnt>times) {
            return element;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
