public class TicTacToe
{
    private String [][] array = new String [3][3];
    private String [] arr1 = {"-","-","-"};
    public TicTacToe (){
        array[0] = arr1;
        array[1] = arr1;
        array[2] = arr1;
    }
    
    public String[][] getBoard (){
        return  array;
    }
}