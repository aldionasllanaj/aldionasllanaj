public class Randomizer
{
    public static int nextInt()
    {
        int randInteger = (int)(Math.random() * (10) + 1);
        return randInteger;
        //Implement this method to return a random number from 1-10
    }
    
    public static int nextInt(int min, int max)
    {
        int randInteger2 = (int)(Math.random() * (max - min - 1) + min);
        return randInteger2;
        //Implement this method to return a random integer between min and max
    }
}