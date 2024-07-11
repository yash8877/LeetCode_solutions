import java.math.BigInteger;
public class Leetcode13 {
    public static int[] plusOne(int[] digits) {
        String res = "";
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        for (int i = 0; i < digits.length; i++) {
            res += String.valueOf(digits[i]);
        }
        BigInteger num = new BigInteger(res).add(BigInteger.ONE);
        String newans = num.toString();
        int[] right = new int[newans.length()];
        for (int i = 0; i < newans.length(); i++) {
            char ch = newans.charAt(i);
            right[i] = Character.getNumericValue(ch);
        }
        return right;
    }
    public static void main(String[] args) {
        int[] pass = {5,6,2,0,0,4,6,2,4,9};
        int[] store = plusOne(pass);
        for (Integer i : store) {
            System.out.print(i+" ");
        }
    }
}
