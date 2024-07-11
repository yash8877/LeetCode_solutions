public class SelectionSort {
    public static int[] selectionSort(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp; 
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int num[] = {2,0,2,1,1,0};
        int [] ans = selectionSort(num);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
