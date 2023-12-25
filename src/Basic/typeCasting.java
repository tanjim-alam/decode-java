package Basic;

import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Please enter 2nd number : ");
        int b = sc.nextInt();
//        int sum = a/b;
//        double result = (double)sum;// 2.0 why because sum are returing int then i am converting type;
        double result = (double)a/b; //2.5 why because a/b first converting types then
        System.out.print("Sum is : " + result);
    }
}
