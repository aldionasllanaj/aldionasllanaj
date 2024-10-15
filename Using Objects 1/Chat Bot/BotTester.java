import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {
        //Put you code here
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Bot chat = new Bot (name);
        chat.greeting();
        System.out.println();
        chat.help();
        System.out.println();
        chat.firstBug();
        System.out.println();
        chat.imperialCountries();
        System.out.println();
        chat.goodbye();
        
    }
}