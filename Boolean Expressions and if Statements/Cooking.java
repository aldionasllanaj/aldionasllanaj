public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       int random = (int) ((Math.random() * 150 ) + 90);
 
       // Print the number of seconds
       System.out.println("Microwaving for " + random + " seconds");
       // Use two if statements to print the temperature
       if (random <= 120){
           System.out.println("Rolls will be the right temperature!");
       }
       if (random > 120){
           System.out.println("Rolls will be boiling hot!");
       }
    }
}