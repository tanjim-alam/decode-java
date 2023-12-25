package Basic;

import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : " );
        double r = sc.nextDouble();
        double pi = 3.14;
        double area = pi*r*r;
        int result = (int)area; // here i am doing typecasting. i am converting dobule data type to int data type
        System.out.println("Area of circle with "+r+ " is " + result);
    }
}
