import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner (System.in);
    
        System.out.println("How many hours were you parked?");
        double hours = input.nextDouble();

        double cost = 4.25 * hours;
    
        if (hours > 3){
            cost *= 0.75 ;
        }
     
        if(cost < 7){
            cost = 7;
        }
        
        System.out.println("You owe" + " $" + cost);
    }
}