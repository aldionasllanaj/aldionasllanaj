import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner (System.in);
        System.out.println("Enter movie rating (as a decimal)");
        double rate = input.nextDouble();
        System.out.println("Rating rounded:");
        int round = (int)(rate + 0.5);
        System.out.print(round);
        
       
    }
}