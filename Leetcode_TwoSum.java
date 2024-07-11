public class Leetcode_TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while (i < j) { 
            int sum = numbers[i] + numbers[j];
            if(sum == target)return new int[]{i+1 , j+1};
            else if(sum > target)j--;
            else{i++;}
        }
        return new int[]{-1, -1};
    }    
    public static void main(String[] args) {
        // int[] input = {2,7,11,15};
        // int target = 9;
        // int[] input = {2,3,4};
        // int target = 6;
        int[] input = {-1,0};
        int target = -1;
        int[] show = twoSum(input, target);
        for (int i : show) {
            System.out.print(i+" ");
        }
    }
}