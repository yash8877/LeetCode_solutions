import java.util.Arrays;

public class LeetCode_String14 {
    public static String longestCommonPrefix(String[] strs) {


        /////BRUTE FORCE APPROACH////

        // String prefix = "";
        // for (int i = 0; i < strs[0].length(); i++) {
        //     boolean flag = true;
        //     char ch = strs[0].charAt(i);
        //     for (int j = 1; j < strs.length; j++) {
        //         if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
        //            flag = false;
        //            break;
        //         }
        //     }
        //     if (flag == false) {
        //         break;
        //     }
        //     else{
        //         prefix += ch;
        //     }
        // }
        // return prefix;

        /////OPTIMAL APPROACH ////
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        int len = strs.length-1;
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) != strs[len].charAt(i)) {
                break;
            }
            ans.append(strs[0].charAt(i));
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        // String[] strs = {"dog","racecar","car"};
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
