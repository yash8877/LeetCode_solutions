import java.util.ArrayList;

public class Leetcode2582 {
    public static int passThePillow(int n, int time) {
        boolean forward = true;
        int count = 1;
        while (time > 0) {
            if (forward) {
                if (count == n) {
                    forward = false;
                    count--;
                }
                else{
                    count++;
                }
            }
            else{
                if (count == 1) {
                    forward = true;
                    count++;
                }
                else{
                    count--;
                }
            }
            time--;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        int t = 10;
        System.out.println(passThePillow(n, t));
    }
}
