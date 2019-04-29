/*Write a program to reverse any string without using String Buffer.
Input : london
Output : nodnol*/


package pranjal;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String str;
        System.out.println("Enter a String to reverse:");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();


        char temp[] = str.toCharArray();
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i]);
        }

    }
}