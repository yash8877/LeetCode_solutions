public class Leetcode852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        while (arr[i] < arr[i+1]) {
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        int [] num = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(num));
    }

}
