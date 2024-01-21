package Arrays;

import java.util.Scanner;

public class lineaSearch {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target Number");
        int x = sc.nextInt();

        System.out.print("Enter Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter array element");
            arr[i] = sc.nextInt();
        }

        boolean flag = false; // means target is not found
        for (int i=0; i<n; i++){
            if (arr[i] == x){
                flag = true; //means target is founded
                break;
            }
        }

        if (flag) System.out.println("Founded");
        else System.out.println("Not Found");
         */

//        -----------------------------

        /*
        // find maximum value from array;
        int[] arr2 = {12,44,3,2,5,33,6,33,23};
//        int max = arr2[0];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr2.length; i++){
            if (arr2[i] >max){
                max= arr2[i];
            }
        }
        System.out.println(max);
         */


        // find second maximum value from array;
        int[] arr3 = {53,44,3,2,5,33,6,33,23};
        int max = arr3[0];
        int seconMax = Integer.MIN_VALUE;
        for (int i=1; i<arr3.length; i++){
            if (arr3[i] > max){
                max = arr3[i];
            }
        }
        for (int i=0; i<arr3.length; i++){
            if (arr3[i] < max){
                if (arr3[i] > seconMax){
                    seconMax = arr3[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(seconMax);
    }
}
