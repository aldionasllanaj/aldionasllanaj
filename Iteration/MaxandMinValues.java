import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner input = new Scanner (System.in);
        int largest = 0;
        int smallest = 0 ;
        while(true){
            System.out.println("Enter a number or 0 to quit:");
            int num = input.nextInt();
            System.out.println("Results so far:");
            if (num == 0){
                return;
            }
            if (largest < num){
                largest = num;
            }
            if (smallest > num || smallest == 0){
                smallest = num;
            }
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }
    }
}