public class Randomizer
{
    public static int nextInt()
    {
        int randInteger = (int)(Math.random() * (10) + 1);
        return randInteger;
    }
    
    public static int nextInt(int min, int max)
    {
        int randInteger2 = (int)(Math.random() * (max - min - 1) + min);
        return randInteger2;
    }
}