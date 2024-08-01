public class Leetcode1678 {
    public static String interpret(String details) {
        return details.replace("()", "o").replace("(al)", "al");
    }
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));


    }
}
