public class Leetcode2833 {
    private static int furthestDistanceFromOrigin(String moves){
        int countLeft = 0, countRight = 0, count_ = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L')countLeft++;
            else if(moves.charAt(i) == 'R')countRight++;
            else count_++; 
        }
        return Math.abs(countLeft - countRight) + count_;
    }

    public static void main(String[] args) {
        String moves = "_R__LL_";
        System.out.println(furthestDistanceFromOrigin(moves));
    }
}
