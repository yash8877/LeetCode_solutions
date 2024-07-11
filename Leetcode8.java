import java.util.List;

public class Leetcode8 {
    
    public static void main(String[] args) {
        List<List<String>> items1 = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));

        System.out.println(countMatches(items1, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int flag = 0;
        if (ruleKey.equals("color")) {
            flag = 1;
        } else if (ruleKey.equals("name")) {
            flag = 2;
        }
        for (List<String> list : items) {
            if (list.get(flag).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
