import java.util.ArrayList;
import java.util.List;

public class Leetcode2553 {
    
    public static void addDigitsToList(int number, List<Integer> anslist) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        int j = 0;
        while (j < sb.length()) {
            int n = Character.getNumericValue(sb.charAt(j));
            anslist.add(n);
            j++;
        }
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> anslist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                addDigitsToList(nums[i], anslist);
            } else {
                anslist.add(nums[i]);
            }
        }

        int[] array = anslist.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77, 4, 5, 6, 152};
        int[] ans = separateDigits(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
