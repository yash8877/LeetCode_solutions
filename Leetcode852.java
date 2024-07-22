public class Leetcode852 {
    public static int peakIndexInMountainArray(int[] arr) {
        // int i = 0;
        // while (arr[i] < arr[i+1]) {
        //     i++;
        // }
        // return i;
        int low = 0, high = arr.length-1;
        while (low < high) {
            int mid = (low+high)/2;
            if (arr[mid] < arr[mid+1]) {
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int [] num = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(num));
    }

}
