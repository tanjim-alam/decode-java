package TwoDArrays;

public class findLargest {
    public static void main(String[] args) {
        int[][] arr = {{4,6,2,11},{3,12,74,10},{44,33,43,64}};
        int max = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >max){
                    max = arr[i][j];
                }
            }
        }
        System.out.print(max);
    }
}
