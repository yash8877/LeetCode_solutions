import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, p = m - n -1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[p] = nums2[j];
                p--;
                j--;
            }
            else{
                nums1[p] = nums1[i];
                p--;
                i--;
            }
            while (j >=0) {
                nums1[p] = nums2[j];
                p--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}; 
        int m = 3; 
        int[] nums2 = {2, 5, 6};
        int n = 3; 
        
        merge(nums1, m, nums2, n); 
    }
}
