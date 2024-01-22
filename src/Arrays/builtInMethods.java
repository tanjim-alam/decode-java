package Arrays;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //sort methods
        Arrays.sort(arr);
        //For Each methods
        for (int ele : arr){
            System.out.print(ele + " " );
        }
    }
}
