    /*4.
    Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
    6 6 . . . nth iteration.*/

package pranjal;

import java.util.Scanner;

public class Numberpattern
{
    public static void main(String[] args )
    {
        int no;
        System.out.println("Enter no of times you want to print");
        Scanner scan=new Scanner(System.in);
        no=scan.nextInt();

        for(int i=1;i<no;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }

        }
    }
}
