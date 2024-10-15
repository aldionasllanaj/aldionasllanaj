import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score? ");
        int score = input.nextInt();
        System.out.println("How many rebound did you get? ");
        int rebounds = input.nextInt();
        System.out.println("How many assists did you have? ");
        int assists = input.nextInt();
        // Create three boolean variables that
        // check if the stats are 10 or more
        boolean morePoints = score >= 10;
        boolean moreRebounds = rebounds >= 10;
        boolean moreAssists = assists >= 10;
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        System.out.println("You got 10 or more points: " + morePoints);
        System.out.println("You got 10 or more rebounds: " + moreRebounds);
        System.out.println("You got 10 or more assists: " + moreAssists);
        
    }
}