
/*Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
repeat n number of times in the output String.*/

package pranjal;

import java.util.Scanner;

import static java.lang.System.*;


public class RepeatNoOFTime {
    public static void main(String args[])
    {
        String input1;
        int input2;
        int len=0;
        out.println("Enter Input1 string:");
        Scanner str1=new Scanner(in);
        input1=str1.nextLine();

        out.println("Enter Input2 Integer:");
        Scanner str2=new Scanner(in);
        input2=str2.nextInt();


        for (int i = 1; i <= input2; i++)
        {

            out.println(input1);
             len=input1.length();
        }
        input2--;
        int c=(len-input2);
        for(int j=1;j<c;j++)
            System.out.println(j);

    }

}
