//sell buy stock price
public class Leetcode121 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            else{
                int diff = prices[i] - min;
                if (diff > profit) {
                    profit = diff;
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
