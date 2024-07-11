class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        if (str.equals(output)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Smaple {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(-121));
    }
}
