public class Leetcode2255 {
    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (s.startsWith(words[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"feh", "w", "w", "lwd", "c", "s", "vk", "zwlv", "n", "w", "sw", "qrd", "w", "w", "mqe", "w", "w", "w", "gb", "w", "qy", "xs", "br", "w", "rypg", "wh", "g", "w", "w", "fh", "w", "w", "sccy"};
        String s = "w";
        System.out.println(countPrefixes(words, s));
    }
}
