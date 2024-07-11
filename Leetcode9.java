public class Leetcode9 {
    public static int largestAltitude(int[] gain) {
        int[] org = new int[gain.length+1];
        org[0] = 0;
        int max = 0;
        for(int i = 0,j=0; i < org.length-1; i++)
        {
            org[j+1] = org[j] + gain[i];//-5,
            j++;
            if(org[j] > max){
                max = org[j];
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        int[] ans = {-5,1,5,0,-7};
        System.out.println(largestAltitude(ans));
    }
}
