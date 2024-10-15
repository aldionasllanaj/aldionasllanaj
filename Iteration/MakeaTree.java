public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        for (int i = 8 ; i >= 0 ; i--){
            for(int k = 8; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }