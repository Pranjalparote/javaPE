/*2. Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/

package pranjal;

import java.util.Scanner;

public class tom {
    public static void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();


        if((num>=20)&&(num<=30))
        {
            if(num%2!=0)
            {
                System.out.println("Tom");
            }

        }
        else
        {
            System.out.println("Jerry");
        }

    }
}
