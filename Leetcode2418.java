import java.util.ArrayList;
import java.util.Arrays;
public class Leetcode2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        ArrayList<String> mylist = new ArrayList<>();
        int []result = new int[heights.length]
        for (int i = 0; i < heights.length; i++) {
            mylist.add(names[i]+heights[i]);
        }
        for (int i = 0; i < heights.length; i++) {
            
        }
        Arrays.sort(heights);
    }
    public static void main(String[] args) {
        int []names = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        String []ans = sortPeople(names, heights);
        for (String string : ans) {
            System.out.print(string+" ");
        }
    }
}
