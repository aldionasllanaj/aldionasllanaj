import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        //User Inputs
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the sales tax rate:");
        double taxes = input.nextDouble();
        System.out.println("How many boards do you need?");
        int numBoards = input.nextInt();
        System.out.println("How many boards do you need?");
        int numWindows = input.nextInt();
        //Construction 
        Construction cons = new Construction (8,11,taxes); 
        double numBoard = cons.lumberCost(numBoards);
        double windowsCost = cons.windowCost(numWindows);
        double total = numBoard + windowsCost;
        System.out.println("Total: " + total );
        double grandTotals = cons.grandTotal(total);
        System.out.println("Grand Total: " + grandTotals);
    }
}