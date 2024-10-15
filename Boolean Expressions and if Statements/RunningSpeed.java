import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        //Asking the user how fast they can run a mile (in seconds)
        int time = input.nextInt();
        // Using if-else to determine if the number is less than the fastest recorded mile time
        if (time < 223){
            System.out.println("Are you sure?That's a new world record!");
        }
        else { 
            System.out.println("Right on! Keep running!");
        }
    }
}