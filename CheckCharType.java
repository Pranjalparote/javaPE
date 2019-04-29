/* Write a program that takes a character from the user as input and determines whether the
        character entered is a capital letter, a small case letter, a digit or a special symbol and display
        appropriately.
        Input: A
        Output: Capital letter
        */

package pranjal;

import java.util.Scanner;
import java.lang.String;

public class CheckCharType
{

    public static void main (String[] args)
    {
        String input;
        int i=0;
        System.out.println("Input Character:");
        Scanner scan=new Scanner(System.in);
        input=scan.nextLine();
        char ch=input.charAt(i);

        if (ch>=65 && ch<=90)
            System.out.println("Input Character  is a capital letter");

        else if (ch>=97 && ch<=122)
            System.out.println("Input Character is a small letter");

        else if (ch>=48 && ch<=57)
            System.out.println("Input Character is a digit");

        else
            System.out.println("Input Character is a special symbol");


    }

}
