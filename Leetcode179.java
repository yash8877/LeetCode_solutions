import java.util.Arrays;
import java.util.Comparator;

public class Leetcode179 {
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(strArray, new Comparator<String>() {
            public int compare(String a, String b){
                String first = a + b;
                String second = b + a;
                return second.compareTo(first);
            }
        });

        if (strArray[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String string : strArray) {
            sb.append(string);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int [] nums = {3,30,34,5,9};
        String ans = largestNumber(nums);
        System.out.println(ans);
    }
}
