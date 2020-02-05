import java.util.Scanner;
import java.util.ArrayList;
public class Connect4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Board b1 = new Board();
        Win w1 = new Win();
        
        int column = -1;
        int row = -1;
        int turn = 0;

        String[][] board = 
            {
                { "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ " },
                { "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ " },
                { "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ " },
                { "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ " },
                { "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ " },
                { "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ " },
            };

        System.out.println("1 2 3 4 5 6 7");
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        while (!b1.checkFull(board) && !w1.checkWinBlack(board) && !w1.checkWinWhite(board))
        {
            if (turn % 2 == 0)
            {
                System.out.print("Which column do you want the black chip in? ");
                column = scan.nextInt() - 1;

                if (b1.checkColumn(board, column) == true)
                {
                    while (b1.checkColumn(board, column) == true)
                    {
                        System.out.print("That column is full. Try again: ");
                        column = scan.nextInt() - 1;
                    }
                }

                row = b1.nextSpace(board, column);

                board[row][column] = "■ ";
            }
            else
            {
                System.out.print("Which column do you want the white chip in? ");
                column = scan.nextInt() - 1;

                if (b1.checkColumn(board, column) == true)
                {
                    while (b1.checkColumn(board, column) == true)
                    {
                        System.out.print("That column is full. Try again: ");
                        column = scan.nextInt() - 1;
                    }
                }

                row = b1.nextSpace(board, column);

                board[row][column] = "□ ";
            }
            System.out.println();

            System.out.println("1 2 3 4 5 6 7");
            for (int i = 0; i < board.length; i++)
            {
                for (int j = 0; j < board[0].length; j++)
                {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            turn++;

            if (w1.checkWinBlack(board))
            {
                System.out.println("Black Wins!");
            }
            if (w1.checkWinWhite(board))
            {
                System.out.println("White Wins!");
            }
        }
    }
}
