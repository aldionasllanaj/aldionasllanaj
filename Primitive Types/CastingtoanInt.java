import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a double: ");
        double myDouble = input.nextDouble();
        System.out.println(myDouble);
        int y = (int) (myDouble);
        System.out.println(y);
        myDouble += 0.5;
        System.out.println(myDouble);
        y = (int) (myDouble);
        System.out.println(y);
        
    }
}