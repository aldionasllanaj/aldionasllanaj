import java.util.Scanner;
public class TicTacToeTester

{
    public static void main(String[] args)
    {
        //This is to help you test your methods. Feel free to add code at the end to check
        //to see if your checkWin method works!
        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();
        Scanner input = new Scanner (System.in);
        while (game.getTurn() < 9 && !game.checkWin()){
        System.out.println("What row (0-2) would you like to choose");
        int row = input.nextInt();
        System.out.println("What column (0-2) would you like to choose");
        int col = input.nextInt();
         if (game.pickLocation(row,col)){
             game.takeTurn(row,col);
         }else {
             System.out.println("Location taken! Try again....");
         }
         game.printBoard();
        } 
        
       if (!game.checkWin()) {
        System.out.println("Game end in a tie.");
    } else if(game.getTurn()%2 == 0){
        System.out.println("O Wins!");
    }else{
        System.out.println("X Wins!");
    }
}

}