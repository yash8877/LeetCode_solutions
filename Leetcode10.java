/**
 * Leetcode10
 */
public class Leetcode10 {

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] newimage = new int[image.length][image.length];
        for(int i=0; i<image.length;i++){
            for (int j = image[i].length-1,k=0; j >= 0;j--) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else if(image[i][j] == 1){
                    image[i][j] = 0;
                }
                newimage[i][k] = image[i][j];
                k++;
            }
        }
        return newimage;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int [][] ans = flipAndInvertImage(arr);
        for (int[] row : ans) {
            for (int val : row) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
        
    }
}