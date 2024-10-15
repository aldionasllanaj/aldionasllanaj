import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry 
        Scanner input = new Scanner (System.in);
        System.out.println("What berry do you want?");
        String berries = input.nextLine();
        char berry = berries.charAt(0);
        if (berry == 'E'){
            System.out.println("You ordered Elderberry");
        }else if (berry == 'G'){
            System.out.println("You ordered Gooseberry");
        }else if (berry == 'L') {
            System.out.println("You ordered Lingonberry");
        } else {
            System.out.println("Berry not recognized");
        }
    }
    
}