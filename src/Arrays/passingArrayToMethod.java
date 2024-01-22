package Arrays;

public class passingArrayToMethod {
    public static void main(String[] args) {
        int x = 5;
        int[] arr = {1,3,4,5,6,7};
//        System.out.println(x);
        System.out.println(arr[4]);
        change(x); // it will still give 5. if we are passing any integer value it means pass by value;
//        System.out.println(x);

        changeArr(arr);
        System.out.println(arr[4]); // but it will give 9; if we are passing array in method. it means pass by reference
    }
    public static void change(int y){
        y = 6;
    }
    public static void changeArr(int[] arr){
        arr[4] = 9;
    }
}
