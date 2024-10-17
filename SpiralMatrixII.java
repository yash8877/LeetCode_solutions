public class SpiralMatrixII {
    
    public static int[][] storeSpiral(int n){

        int [][] ans = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int j = 1;
        while (top <= bottom && left <= right) {

            //left -> right
            for (int i = left; i <= right; i++) {
                ans[top][i] = j;
                j++;
            }
            top++;

            //top -> bottom
            for(int i = top; i <= bottom; i++){
                ans[i][right] = j;
                j++;
            }
            right--;

            //right -> left
            if(top <= bottom){
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = j;
                    j++;
                }
                bottom--;

                // bottom -> top
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        ans[i][left] = j;
                        j++;
                    }
                    left++;
                }
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = storeSpiral(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
