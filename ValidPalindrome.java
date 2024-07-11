public class ValidPalindrome {
    public static boolean isPlaindrome(String s){
        if (s.equals(" ")) {
            return true;
        }
        else{
            String org = s.replaceAll("[^a-zA-Z\\d\\s]", "").toLowerCase().replaceAll(" ", "");
            System.out.println(org);
            StringBuilder revstr = new StringBuilder();
            for (char ch : org.toCharArray()) {
                revstr.append(ch);
            }
            revstr.reverse();
            return org.equals(revstr.toString());
        }
    }
    public static void main(String[] args) {
        String input = "0P";
        System.out.println(isPlaindrome(input));
        
    }
}
