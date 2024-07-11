import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class Leetcode11 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        String store = "";
        for (int i = 0; i < num.length; i++) {
            store += String.valueOf(num[i]);
        }
        BigInteger largeValue = new BigInteger(store);
        BigInteger result = largeValue.add(BigInteger.valueOf(k));
        String newstore = String.valueOf(result);
        for (int i = 0; i < newstore.length(); i++) {
            res.add( Character.getNumericValue(newstore.charAt(i)));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        List<Integer> ans = addToArrayForm(num, k);
        for (Integer i : ans) {
            System.out.print(i+" ");
        }
    }
}
