public class Leetcode498 {

    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;//row
        int n = mat[0].length;//col
        int row = 0, col = 0, direction = 1;

        int [] result = new int[m*n];

        for (int i = 0; i < result.length; i++) {
            result[i] = mat[row][col];


            // Moving upwards diagonally
            if (direction == 1) {
                if (col == m - 1) { 
                    row++; 
                    direction = -1; 
                } else if (row == 0) { 
                    col++; 
                    direction = -1; 
                } else { 
                    row--; 
                    col++; 
                }
            } 


            // Moving downwards diagonally
            else {
                if (row == m - 1) { 
                    col++; 
                    direction = 1; 
                } else if (col == 0) { 
                    row++; 
                    direction = 1; 
                } else { 
                    row++; 
                    col--; 
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[] ans = findDiagonalOrder(mat);

        System.out.print(" [");
        for (int i : ans) {
            System.out.print(i+",");
        }
        System.out.print("]");
    }
}
