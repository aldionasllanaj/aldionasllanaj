public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
       double avg = 0;
     for(int value : values){
         avg += value;
     }
     return avg / values.length;
   }
}