import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        // Create user input and let user know whether their word is a palindrome or not!
        Scanner input = new Scanner (System.in);
        System.out.println("User input: ");
        String userInput = input.nextLine();
        if(isPalindrome(userInput)){
            System.out.println("Your word is a palindrome!");
        }
        else{
            System.out.println("Not a palindrom :(");
        }
        
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        if(text.equals(reverse(text))){
            return true;
        } 
        else {
            return false;
        }
        
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        String newString = "";
        for(int i = text.length() - 1; i >= 0 ; i--){
            String character = text.substring (i, i+1);
            newString += character;
        }
    return newString;
        
    }

}