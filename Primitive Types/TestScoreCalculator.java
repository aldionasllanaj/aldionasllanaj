import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        //Start here
        Scanner input = new Scanner (System.in);
        String firstName;
        String secondName;
        String thirdName;
        
        double firstScore;
        double secondScore;
        double thirdScore;
        //First Score
        System.out.print("Please enter the first test name: ");
        firstName = input.nextLine();
        System.out.print("Please enter the first test score: ");
        firstScore = input.nextDouble();
        input.nextLine();
        //Second Score 
        System.out.print("Please enter the second test name: ");
        secondName = input.nextLine();
        System.out.print("Please enter the second test score: ");
        secondScore = input.nextDouble();
        input.nextLine();
        //Third score 
        System.out.print("Please enter the third test name: ");
        thirdName = input.nextLine();
        System.out.print("Please enter the third test score: ");
        thirdScore = input.nextDouble();
        
        double average = (firstScore + secondScore + thirdScore) / 3;
        System.out.println("Your average score is: " + average);
    }
}