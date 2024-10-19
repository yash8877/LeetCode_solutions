import java.util.HashMap;

public class Leetcode791 {

    public static String customSortString(String order, String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Build frequency map for string 's'
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        // First, add characters from 'order' in the required order
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if (freqMap.containsKey(ch)) {
                int count = freqMap.get(ch);
                for (int j = 0; j < count; j++) {
                    ans.append(ch);
                }
                freqMap.remove(ch);  // Remove from map once processed
            }
        }

        // Then, add remaining characters from 's' that are not in 'order'
        for (char ch : freqMap.keySet()) {
            int count = freqMap.get(ch);
            for (int j = 0; j < count; j++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        System.out.println(customSortString(order, s));  // Output: "cbad"
    }
}
