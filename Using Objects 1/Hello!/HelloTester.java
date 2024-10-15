import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        Hello greet = new Hello (name);
        greet.spanish();
        greet.french();
        greet.german();

    }
}