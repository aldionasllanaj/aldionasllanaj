import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a sentence: ");
        String text = input.nextLine();
        System.out.println(useProperGrammar(text));
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        String replaced = "";
        int count = 0;
        for (int i = 0 ; i <= theText.length()-1; i++){
            if (theText.charAt(i) == '2'){
                replaced += "to";
                count++;
            }
            else{
                replaced += "" + theText.charAt(i);
            }
        }
            
     System.out.println("Fixed " + count + " grammatical errors:");
    return replaced;
        
    }
}