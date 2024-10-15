import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        double dinner;
        double laserTag;
        double scoop;
        System.out.println("How much does dinner usually cost?");
        dinner = input.nextDouble();
        System.out.println("How much is laser tag for one person?");
        laserTag = input.nextDouble();
        System.out.println("How much does a triple scoop cost?");
        scoop = input.nextDouble();
        
        dinner += dinner*2;
        laserTag += laserTag;
        scoop += scoop / 3;
        double grandTotal = scoop + laserTag + dinner;
        
        System.out.println("Dinner: $" + dinner );
        System.out.println("Laser Tag: $" + laserTag);
        System.out.println("Ice cream: $" + scoop);
        System.out.println("Grand Total: $" + grandTotal);
        
    }
}