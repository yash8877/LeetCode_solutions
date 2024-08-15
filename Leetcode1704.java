public class Leetcode1704 {
    public static boolean halvesAreAlike(String s) {
        int len = s.length();
        int half = len / 2;
        int count = 0;
        for (int i = 0; i < half; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i + half))) {
                count--;
            }
        }
        return count == 0;
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s = "Ieai";
        System.out.println(halvesAreAlike(s));
    }
}
