import java.util.HashMap;

public class Leetcode523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem == 0 && i >= 1) return true;

            if (myMap.containsKey(rem)) {
                int index = myMap.get(rem);
                if ((i-index) >= 2) return true;
            }
            else{myMap.put(rem, i);}
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {23,2,6,4,7}; int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
}
