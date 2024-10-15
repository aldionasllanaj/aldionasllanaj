public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                        {14, 2, 5, 4, 8, 2},
                        {45, 12, 13, 5, 2, 1}};
        System.out.println("The sum of all elements in the array is: " + sumArray(array));
    }
    
    // Returns the sum of row row in 2D array array
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for (int i = 0 ; i < array[row].length; i++){
           sum += array[row][i];
        }return sum;
    }
    
    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int sum = 0;
        for (int i = 0 ; i < array.length; i++){
           sum += sumRow(array,i);
        }return sum;
    }
}