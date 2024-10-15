import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
    
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a word: ");
    String word = input.nextLine();
    System.out.println("Enter the letter to be replaced:");
    String letterToReplace = input.nextLine();
    System.out.println("Enter the new letter:");
    String newLetter = input.nextLine();
    System.out.println(replaceLetter(word,letterToReplace,newLetter));
    }
    public static String replaceLetter(String word, String letterToReplace, String newLetter)
    {
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
        
           String character =  word.substring(i, i+1);
           if (character.equals(letterToReplace)){
               if (count == 0){
                   count++;
               }
               else{
                   word = word.substring (0,i) + newLetter + word.substring(i+1);
               }
               
           }
            
        }
        return word;
    }
}