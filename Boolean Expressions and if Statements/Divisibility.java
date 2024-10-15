import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int num1 = input.nextInt();
        System.out.println("Enter the divisor: ");
        int num2 = input.nextInt();
        if (num2 == 0){
        System.out.println(num1 + " is not divisible by " + num2 + "!");
        }else if ( num1 % num2 == 0 ) {
            System.out.println(num1 + " is divisible by " + num2 + "!");
        }else {
            System.out.println(num1 + " is not divisible by " + num2 + "!");
        }
    }
}