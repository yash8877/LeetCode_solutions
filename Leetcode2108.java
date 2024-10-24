public class Leetcode2108 {
    public static String firstPalindrome(String[] words) {

        //for method 1
        // for (String string : words) {
        //     if (string.equals(palindrome(string))) {
        //         return string;
        //     }
        // }
        // return "";

        //for method 2
        for (String string : words) {
            if (isPalindrome(string)) {
                return string;
            }
        }
        return "";
    }


    //method 1
    // private static String palindrome(String words){
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = words.length()-1; i >= 0 ; i--) {
    //         sb.append(words.charAt(i));
    //     }
    //     return sb.toString();
    // }

    //method 2
    private static boolean isPalindrome(String words){
        int left = 0, right = words.length() - 1;
        while (left < right) {
            if (words.charAt(left) != words.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String []words = {"def","ghi"};
        System.out.println(firstPalindrome(words));
    }
}
