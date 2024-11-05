import java.util.HashMap;
import java.util.Map;

public class Leetcode3_string {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0,right = 0, left = 0;
        Map<Character,Integer> map = new HashMap<>();
        char []arr = s.toCharArray();
        for (; right < arr.length; right++) {
            int idx = map.getOrDefault(arr[right], -1);
            if (idx != -1 && idx >= left) {
                res = Math.max(res, right-1 - left + 1);
                left = idx + 1;
            }
            map.put(arr[right], right);
        }
        return Math.max(res, right - 1 - left + 1);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
