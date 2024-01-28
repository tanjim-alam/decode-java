package TwoDArrays;

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] maxtri1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] maxtri2 = {{9,8,7},{6,5,4},{3,2,1}};
        int m = maxtri1.length;
        int n = maxtri1[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = maxtri1[i][j] + maxtri2[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
        }}
}