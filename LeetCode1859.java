public class LeetCode1859 {
    public static String sortSentence(String s) {
        String []str = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < str.length+1; i++) {
            for (String search : str) {
                if (search.endsWith(""+i)) {
                    ans.append(search.replace(""+i, " "));
                    search = "";
                }
            }
        }
        return ans.toString().strip();
    }

    public static void main(String[] args) {
        // String s = "is2 sentence4 This1 a3";
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
