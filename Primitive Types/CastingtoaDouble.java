import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner (System.in);
        int firstInt, secondInt;
        System.out.print("First Int: ");
        firstInt = input.nextInt();
        input.nextLine();
        System.out.print("Second Int: ");
        secondInt = input.nextInt();
        double answer = (double)firstInt / secondInt;
        System.out.print(answer);

    }
}