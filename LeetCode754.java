public class LeetCode754 {

    public static int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0;
        int step = 0;
        while (sum < target || (sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
    public static void main(String[] args) {
        System.out.println(reachNumber(4));
        System.out.println(reachNumber(2));
        System.out.println(reachNumber(3));
    }
}
