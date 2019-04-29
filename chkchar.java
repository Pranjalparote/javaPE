/*3. Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter
Input : p
Output : Consonant
Input : ap
Output : Vowel Consonant (should it be a - vowel, p - consonant)*/

package pranjal;
import java.util.Scanner;
public class chkchar {

    public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);

                System.out.print("Input a word: ");
                String str = in.next().toLowerCase();

                boolean uppercase = str.charAt(0) >= 65 && str.charAt(0) <= 90;
                boolean lowercase = str.charAt(0) >= 97 && str.charAt(0) <= 122;
                boolean vowels = str.equals("a") || str.equals("e") || str.equals("i")
                        || str.equals("o") || str.equals("u");

                if (str.length() >= 1)
                {
                    if (!(uppercase || lowercase))
                    {
                        System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
                    }
                    else if (vowels)
                    {
                        System.out.println("Entered  letter is Vowel");
                    }
                    else
                    {
                        System.out.println("Entered letter is Consonant");
                    }
                }
                 else
                {
                    System.out.println("Error. you had not entered anything");
                }
            }

    }

