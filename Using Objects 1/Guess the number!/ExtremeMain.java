import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner (System.in);
        // Create an Extremes object
        Extremes extr = new Extremes ();
        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum integer value is? ");
        int guess1 = input.nextInt();
        // Compute and display what they'd need to multiply by
        System.out.print("You'd need to multiply number by " + extr.maxQuotient(guess1) );
        // to reach the maximum number
        System.out.println(" to reach the max value! ");
        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is? ");
        int guess2 = input.nextInt();
        // Compute and display what they'd need to multiply by
        System.out.print("You'd need to multiply your number by " + extr.minQuotient(guess2));
        // to reach the minimum number
        System.out.println(" to reach the min value! ");
    }
}