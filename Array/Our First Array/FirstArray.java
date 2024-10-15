public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        String [] arr1 = {"Las Vegas", "Minsk", "Sao Paulo"};
        int [] arr2 = {667501,2038822,12330000};
        double [] arr3 = {8.11,1.36,6.05};
        
      // Print all 3 arrays according to the output in the description
      System.out.println("Las Vegas's population is " + arr2[0] + ".");
      System.out.println("Minsk's population is " + arr2[1]+ ".");
      System.out.println("Sao Paulo's population is " + arr2[2]+ ".");
      System.out.println();
      System.out.println("The least amount of sunshine Las Vegas gets is " + arr3[0]+ " hours a day.");
      System.out.println("The least amount of sunshine Minsk gets is " + arr3[1] + " hours a day.");
      System.out.println("The least amount of sunshine Sao Paulo gets is " + arr3[2] + " hours a day.");
      
    }
}