import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       // Start Here!
       Scanner input = new Scanner (System.in);
       System.out.println("Hello! What is your name?");
       String name = input.nextLine();
       Bot2 chat2 = new Bot2 (name);
       chat2.greeting();
       System.out.println();
       System.out.println("What is your favorite animal?");
       String animal = input.nextLine();
       chat2.favoriteAnimal(animal);
       System.out.println();
       System.out.println("If you could visit any place, where would you go?");
       String place = input.nextLine();
       chat2.destination(place);
       System.out.println();
       System.out.println("What is your favorite number?");
       int number = input.nextInt();
       chat2.favoriteNumber(number);
       System.out.println();
       chat2.goodbye();
    }
}