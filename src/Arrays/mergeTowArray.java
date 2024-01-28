package Arrays;

import java.sql.Array;

public class mergeTowArray {
    public static void main(String[] args) {
        int[] arr1 = {1,5,6,88};
        int[] arr2 = {3,9,11,13,14,18};
        int[] result = new int[arr1.length + arr2.length];
        int i =0;
        int j = 0;
        int k = 0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<=arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }
            else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<arr1.length){
                result[k] = arr1[i];
                i++;
                k++;
        }
        while (j<arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }

        for (int ele:result){
            System.out.print(ele + " ");
        }

    }
}
