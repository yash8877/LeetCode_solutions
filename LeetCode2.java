public class LeetCode2 {
    public static int removeElement(int[] nums, int val) {
        int i;
        int n = nums.length;
        for(i = 0; i <= n-1; i++){
            if(nums[i] == val){
                for(int j = i; j < n-1; j++){
                    nums[j] = nums[j+1];
                }
                n--;
                i--;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val)); 
    }
}
