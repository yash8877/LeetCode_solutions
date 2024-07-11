import java.util.ArrayList;
import java.util.List;

public class Leetcode5 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> list1 = new ArrayList<>();
        boolean check = false;
        for (int i = 0; i < candies.length; i++) {
            int sum = 0;
            sum = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (sum >= candies[j]) {
                    check = true;
                }
                else{
                    check = false;
                    break;
                }
            }
            list1.add(check);
        }
        return list1;

    }
    public static void main(String[] args) {
        int n = 10;
        int[] candies = {12,1,12};
        List<Boolean> list = new ArrayList<>();
        list = kidsWithCandies(candies, n);
        for (boolean bl : list) {
            System.out.print(bl+" ");
        }
    }
}
