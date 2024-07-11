public class Leetcode12 {
    public static boolean findRotation(int[][] mat, int[][] target) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = target[i][j];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = { {0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(arr, target));
    }
}
