package Arrays;

public class arraysQuestion {
    public static void main(String[] args) {

        /*
        int[] arr = {81,17,45,36,31,100};
        for (int i=0; i<arr.length; i++){
          if (arr[i]<35){
              System.out.println("Student roll number is: " + i);
          }
        }
         */

        // Two Sum
        /*
        int[] arr = {2,3,4,5,6,7,3};
        int target = 7;
        twoSum(arr,target);

         */

        // reverse array using two pointer
        int[] arr = {2,3,4,5,6,7,3};
        reverse(arr);
    }

//    public static void twoSum(int[] arr, int target){
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if (arr[i] + arr[j] == target){
//                    System.out.println(i + " " +j + "res");
//                    break;
//                }
//            }
//        }
//    }

    public static void reverse(int[] arr) {
        int i=0;
        int j = arr.length-1;
        while ( i< j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele + " ");

        }
    }

}
