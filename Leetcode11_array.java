public class Leetcode11_array {

    public static int maxArea(int[] height) {
        int max = 0;

        //by this method the time limit will be exceeds
        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i+1; j < height.length; j++) {
        //         int len = Math.min(height[i], height[j]);
        //         int width = j-i;
        //         int area = len * width;
        //         if (area > max) max = area;
        //     }
        // }

        int left = 0, right = height.length-1;
        while (left < right) {
            int len = Math.min(height[left], height[right]);
            int width = right - left ;
            int area = len * width;
            max = Math.max(area,max);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
