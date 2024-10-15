import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        // Ask for actual amount
        System.out.println("Enter you actual amount: ");
        int amount = input.nextInt();
        // Compare numbers by creating three booleans
        boolean overGoal = amount > goal;
        boolean underGoal = amount < goal;
        boolean exactly = amount == goal;
        // Display results as instructed
        System.out.println("Went over goal? " + overGoal);
        System.out.println("Did not meet goal? " + underGoal);
        System.out.println("Met goal exactly? " + exactly);
    }
}