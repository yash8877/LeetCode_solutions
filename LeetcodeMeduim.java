public class LeetcodeMeduim {
    public static int[] searchRange(int[] nums, int target){
        int first = firstValue(nums, target);
        int last = lastValue(nums, target);
        return new int[]{first,last};
    }
    public static int firstValue(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    public static int lastValue(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] input = {1,4,5,2,2};
        int target = 2;
        int[] sol = searchRange(input, target);
        for (int i : sol) {
            System.out.print(i+" ");
        }
    }
}
