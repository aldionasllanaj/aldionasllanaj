public class WorkShift
{
    public static void main(String[] args)
    {
        // Start here
        int hours = 20;
        int minutes = 42;
        int seconds = 16;
        minutes *= 60;
        hours *= 3600;
        seconds += minutes + hours;
        System.out.print("He worked " + seconds + " seconds.");
        
    }
}