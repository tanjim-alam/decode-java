package Arrays;

import java.util.ArrayList;

public class basicOfArrayList {
    public static void main(String[] args) {
        //declear arraylist
        ArrayList<Integer> arr = new ArrayList<>(6);
        // add ele in arrayList
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,3);
        arr.add(3,4);
        arr.add(4,5);
        arr.add(5,6);
        System.out.println(arr.size());
        System.out.println(arr);
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }


        //update
        arr.set(3, 14);
        System.out.println(arr);

        //get ele
        System.out.println(arr.get(3));

        //add new ele (Push)
        arr.add(99);
        for (int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }


        System.out.println();
        //remove ele
        arr.remove(3);
        System.out.println(arr);
    }
}
