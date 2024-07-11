public class LeetCode875 {
    public static int findMax(int[] piles){
        int max = 0;
        for (int i : piles) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static int findTime(int[] piles, int h){
        int totalTime = 0;
        int ban = 1;
        for (int i : piles) {
            totalTime = totalTime + (int)Math.ceil((double)i/ban);
        }
        return totalTime;
    }


    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = findMax(piles);
        while (start < end) {
            int mid = (end + start)/2;
            int totalTime = findTime(piles, mid);
            if (totalTime <= h) {
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] ban = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(ban, h));
    }
}
