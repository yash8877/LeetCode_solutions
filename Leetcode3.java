import java.util.ArrayList;
import java.util.List;
public class Leetcode3 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> targetList = new ArrayList<>();
        Arrays.fill(target, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (target[index[i]] != -1) { // If the target index is already occupied, shift elements to the right
                for (int j = nums.length - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[index[i]] = nums[i]; // Insert nums[i] at index[index[i]]
        }

        
        //or we can use the array list to solve this problem
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = targetList.get(i);
        }
        return target;
    }
    

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int target[] = (createTargetArray(nums, index));
        for (int i : target) {
            System.out.print(i+",");
        }
    }
}
