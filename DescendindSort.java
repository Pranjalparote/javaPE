/*7. Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
Input : 234534
Output : Sorted number in non-increasing order : 544332

Sum of even numbers : 10
False

*/
package pranjal;

import java.util.Scanner;

public class DescendindSort
{

    public static void main(String[] args) {
        int sum=0;
        Scanner scan1=new Scanner(System.in);
        System.out.print("How many numbers you want to sort: ");
        int a=scan1.nextInt();

        int i,j,k=0,m; // i and j is used in various loops.
        int num[]=new int[a];
        int great[]= new int[a];    //This array elements will be used to store "the number of being greater."

        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        for(i=0;i<a;i++)
            num[i] = scan2.nextInt();

        for (i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                if(num[i]>num[j])   //first time when executes this line, i=0 and j=0 and then i=0;j=1 and so on. each time it finishes second for loop the value of num[i] changes.
                    k++;
            }
            great[i]=k++;  //At the end of each for loop (second one) k++ contains the total of how many times a number is greater than the others.
            k=0;
        }  // And then, again k is forced to 0, so that it can collect (the total of how many times a number is greater) for another number.


        System.out.print("Non increasing order of numbers: ");
        for(i=0;i<=a;i++)
        {
            for (j = 0; j < a; j++)
            {
                if (great[j] == a - i)
                {
                    System.out.print(+num[j] + ",");
                }
            }
        }

        if (num[k]%2==0)
        {
           sum=sum+num[i] ;
        }else{System.out.println("ignored");}
        if(sum>15){System.out.println("true");}
        else{System.out.println("false");}


    }
}
