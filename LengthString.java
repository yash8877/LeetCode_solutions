public class LengthString {
    public static int lenstring(String s) {
        int count = 0;
        String newstr = s.replaceAll("\\s+", "");
        for (char sh : newstr.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("The length of the string is: " + lenstring("yash raj kumar"));
    }
}