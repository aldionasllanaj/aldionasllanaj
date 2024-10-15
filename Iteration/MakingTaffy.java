import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       // Your code starts here\
       Scanner input = new Scanner (System.in);
       System.out.println("Starting Taffy Timer...");
       while (true){
       System.out.print("Enter the temperature: ");
       int num = input.nextInt();
           if (num < 270){
               System.out.println("The mixture isn't ready yet.");
           }else if (num >= 270){
               break;
              }
                  
        }
         System.out.println("Your taffy is ready for next step!");
    }
}