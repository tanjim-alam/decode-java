package Arrays;

public class arraysQuestion {
    public static void main(String[] args) {
        int[] arr = {81,17,45,36,31,100};
        for (int i=0; i<arr.length; i++){
          if (arr[i]<35){
              System.out.println("Student roll number is: " + i);
          }
        }
    }
}
