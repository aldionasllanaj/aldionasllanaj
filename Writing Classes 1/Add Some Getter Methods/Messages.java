public class Messages
{
    public static void main(String[] args)
    {
        // Your code here.
        // Create two Comment objects and print them out.
         Comment comm = new Comment("Aldion" , "hey guys!!", "December 12,2023");
         Comment comm1 = new Comment ("Ethan" , "Hi Aldion , how are you?" , "December 11, 2023");
         
         System.out.println(comm);
         System.out.println(comm1);
        // Then use the accessor methods to print out the instance variables
    }
}