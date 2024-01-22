package Arrays;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int[] nums = arr; //shallow copy;
//        nums[0] = 9;
//        System.out.println(arr[0]); // it will be 9 but i am not changing of arr because this is a shallow copy arr
//        for (int ele : nums){
//            System.out.print(ele + " ");
//        }

        int[] nums2 = Arrays.copyOf(arr,arr.length); // deep copy
        nums2[0] = 9;
        System.out.println(arr[0]); // it will be 1  because here i am doing deep copy. it means it will not modify main arr;
    }
}
