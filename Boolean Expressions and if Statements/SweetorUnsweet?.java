import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want?");
        int sugar = input.nextInt();
        
        System.out.println("Confirming your order. You wanted: ");
        System.out.print(drink);
        if (sugar > 0){
            System.out.println(" with sugar");
        }
            }
}