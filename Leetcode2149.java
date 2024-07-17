import java.util.ArrayList;

public class Leetcode2149 {
    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        // ArrayList<Integer> plusList = new ArrayList<>();
        // ArrayList<Integer> minusList = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] < 0) {
        //         minusList.add(nums[i]);
        //     }
        //     else{
        //         plusList.add(nums[i]);
    
        //     }
        // }
        // for (int i = 0,j = 0,k=0; i < nums.length; i++) {
        //     if (i % 2 == 0) {
        //         nums[i] = plusList.get(j);
        //         j++;
        //     }
        //     else{
        //         nums[i] = minusList.get(k);
        //         k++;
        //     }
        // }
        // return nums;
        int plusIndex = 0;
        int minusIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (plusIndex < nums.length) {
                    result[plusIndex] = nums[i];
                    plusIndex += 2;
                }
            }
            else{
                if (minusIndex < nums.length) {
                    result[minusIndex] = nums[i];
                    minusIndex += 2;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,1};
        int[] ans = rearrangeArray(nums);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
    }
}
