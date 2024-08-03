public class LeetCode1021 {
    public static String removeOuterParentheses(String s){
        int length = s.length();
        if (length <= 2) {
            return "";
        }
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int balance = 0;
        for (int i = 1; i < length; i++) {
            if (ch[i] == '(') {
                balance++;
                if (balance > 0) {
                    ans.append('(');
                }
            }
            else{
                if (balance > 0) {
                    ans.append(')');
                }
                balance--;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
}
