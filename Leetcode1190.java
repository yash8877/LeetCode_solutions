import java.util.ArrayList;
import java.util.Stack;

public class Leetcode1190 {
    public static String reverseParentheses(String s) {
        Stack<Character> store = new Stack<>();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                while (store.peek() != '(') {
                    list.add(store.pop());
                }
                store.pop();
                for (Character ch : list) {
                    store.push(ch);
                }
                list.clear();
            }
            else{
                store.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (Character ch : store) {
            ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "(abcd)";
        System.out.println(reverseParentheses(s));
    }
}