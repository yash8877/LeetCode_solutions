public class Leetcode5_string {
    
    public static boolean isPalindrome(String s, int i, int j){
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static String longestPalindromeSubstring(String s){
        int max = 0, start = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindromeSubstring(s));
    }
}
