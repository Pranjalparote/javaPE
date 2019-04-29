/*1. Write a program which accepts a number as input and check whether the given number is
palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
Input : 2468642
Output : 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output : 12345654321 is palindrome and sum of even numbers is less than 25
-------------------------------------------------------------------------------------------------------------- */
package pranjal;
import java.util.Scanner;

public class pal
{
    public static void main(String[] args)
    {
            System.out.println("Enter Number: ");
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();

            int rem, res = 0, temp, sum = 0;

            temp = num;

            while (temp > 0)
            {
                rem = temp % 10;
                res = (res * 10) + rem;
                temp = temp / 10;
            }

            if (num == res)
            {
                System.out.println("Number is Palindrome");

                while (num > 0)
                {
                    rem = num % 10;
                    if (rem % 2 == 0)
                    {
                        sum = sum + rem;
                    }
                    num = num / 10;
                }

                if (sum > 25)
                {
                    System.out.println("and the sum of even numbers is greater than 25 " + sum);
                }
                else
                    {
                    System.out.println("and the sum of even numbers is less than 25 " + sum);
                    }

            }
            else
                {
                System.out.println("Number is not Palindrome");
                }

        }
    }