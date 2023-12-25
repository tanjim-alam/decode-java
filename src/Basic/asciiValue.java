package Basic;

import java.util.Scanner;

public class asciiValue {
    public static void main(String[] args) {
        // ASCII Value of characters
        //A - 65 to Z- 90
        //a - 97 to z - 122
        //0 - 48 to 9 - 57
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a characte : ");
        char ch = sc.next().charAt(0);
        int asciiValue = (int)ch; //for getting ASCII Value of any characters just convert data type in integer
        System.out.println(asciiValue);
    }
}
