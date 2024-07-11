public class Leetcode1 {
    public static int lengthOfLastWord(String s) {
        String result = s.replaceAll("\\s+", " ").trim();
        int count = 0;
        for (int i = result.length() - 1; i >= 0; i--) {
            count++;
            if (result.charAt(i) == ' ') {
                return count - 1;
            }
        }

        return count;
    }  
    public static String reverseWords(String s){
        String[] str = s.replaceAll("\\s+", " ").trim().split(" ");
        StringBuilder revstr = new StringBuilder();
        for (int i = str.length-1; i >= 0; i--) {
            revstr.append(str[i]+" ");
        }
        return revstr.toString().trim();

    } 
    public static String reverseVowels(String s){
        if (s.trim().isEmpty()) {
            return s;
        }
        String org = s;
        String str = org.replaceAll("[aeiouAEIOU]", "_");
        String vowel = "";
        for (int i = org.length()-1; i >= 0; i--) {
            if (org.charAt(i) == 'a' || org.charAt(i) == 'A' ||org.charAt(i) == 'e'|| org.charAt(i) == 'E'|| org.charAt(i) == 'i' || org.charAt(i) == 'I'|| org.charAt(i) == 'U'  || org.charAt(i) == 'u') {
                vowel += org.charAt(i);
            }
        }
        int index = 0;
        StringBuilder revstr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '_') {
                revstr.append(vowel.charAt(index++));
            }
            else
                revstr.append(ch);
        }
        return revstr.toString();
    }

    public static void main(String[] args) {
        String text = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(lengthOfLastWord(text));
        System.out.println(reverseWords(text));
        System.out.println(reverseVowels(text));
    }
}
