/*Write a program that reads an unspecified number of integer arguments using Scanner Class
and adds them together. The program should display total of the given input number and should
only consider integer value.The program should display an error message if there are any non
integer values
Input : 12 23 2 4
Output : 41     */

/*
package pranjal;

import java.util.Scanner;

public class CheckIntAndSum
{
    public static void main(String[] args)
    {

        int i=0;
        int positive = 0, negative = 0, addition = 0, count = 0;
        int choice;
        int ip;
        boolean notAnInteger = true;
        Scanner sc = new Scanner(System.in);
         char c = "a";

        System.out.println("Enter the number: ");
        Scanner ip=new Scanner(System.in);
        boolean number=ip.hasNextInt();

        while (notAnInteger)
        {
            ip = sc.next();
            while ((number = ip.next()) != 0)
            {
                try
                {

                    choice = Integer.parseInt(ip);
                    addition += number;
                    count++;
                    notAnInteger = false;
                }
                catch (Exception e)
                {
                    System.out.println("Error.Not an integer");
                }

            }
        }

        System.out.println("The total is " + addition);

    }
}*/