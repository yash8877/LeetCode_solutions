import java.util.ArrayList;
import java.util.List;
public class Leetcode18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int j2 = j+1; j2 < nums.length; j2++) {
                    for (int k = j2+1; k < nums.length; k++) {
                        long sum = nums[i] + nums[j];
                        sum+=nums[j2];
                        sum+=nums[k];
                        if (sum == target) {
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[j2]);
                            list.add(nums[k]);
                            result.add(list);
                            
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        // int target = 0;
        List<List<Integer>> ans = fourSum(nums, 8);
        for (List<Integer> inner : ans) {
            for (Integer vlaue : inner) {
                System.out.print(vlaue+" ");
            }
            System.out.println();
        }
    }
}
