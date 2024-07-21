public class Leetcode1095 {
    /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int idx = peekElement(mountainArr);
    
        // Check if target is greater than peak element
        if (target > mountainArr.get(idx)) {
            return -1;
        }
    
        int result = binarySearch(mountainArr, target, 0, idx);
        if (result != -1) {
            return result;
        }
    
        return decreaseBinarySearch(mountainArr, target, idx + 1, n - 1);
    }
    
    
    
        public static int peekElement(MountainArray mountainArr){
            int left = 0, right = mountainArr.length()-1;
            while(left < right){
                int mid = (right + left)/2;
                if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                    left = mid + 1;
                }
                else{
                    right = mid;
                }
            }
            return right;
        }
    
    
    
        public static int binarySearch(MountainArray mountainArr, int target, int left, int right){
            while(left <= right){
                int mid = (left+right)/2;
                if(mountainArr.get(mid) == target){
                    return mid;
                }
                else if(mountainArr.get(mid) > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            return -1;
        }
    
    
    
        public static int decreaseBinarySearch(MountainArray mountainArr, int target, int left,int right)
        {
            while(left <= right){
                int mid = (left+right)/2;
                if(mountainArr.get(mid) == target){
                    return mid;
                }
                else if(mountainArr.get(mid) > target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            return -1;
        }

}
