import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BoardMethods b1 = new BoardMethods();

        int turn = 0;

        String[][] values = 
            {
                {"_ ", "_ ", "_ "},
                {"_ ", "_ ", "_ "},
                {"_ ", "_ ", "_ "}
            };

        System.out.println("Enter coordinates. (Top right would be \"0 0\")");
        while (!b1.checkWinO(values) && !b1.checkWinX(values) && !b1.checkWinNone(values))
        {
            if (turn % 2 == 0)
            {
                System.out.print("O's Turn: ");
                int x = scan.nextInt();
                int y = scan.nextInt();
                if (values[x][y] == "X " || values[x][y] == "O ")
                {
                    while (values[x][y] == "X " || values[x][y] == "O ")
                    {
                        System.out.print("A marker is already there. Try again: ");
                        x = scan.nextInt();
                        y = scan.nextInt();
                    }
                    values[x][y] = "O ";
                }
                else
                {
                    values[x][y] = "O ";
                }
                turn++;
            }
            else 
            {
                System.out.print("X's Turn: ");
                int x = scan.nextInt();
                int y = scan.nextInt();
                if (values[x][y] == "X " || values[x][y] == "O ")
                {
                    while (values[x][y] == "X " || values[x][y] == "O ")
                    {
                        System.out.print("A marker is already there. Try again: ");
                        x = scan.nextInt();
                        y = scan.nextInt();
                    }
                    values[x][y] = "X ";
                }
                else
                {
                    values[x][y] = "X ";
                }
                turn++;
            }
            for (int i = 0; i < values.length; i++)
            {
                for (int j = 0; j < values[0].length; j++)
                {
                    System.out.print(values[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            if (b1.checkWinO(values))
            {
                System.out.print("O's Win!");
            }
            if (b1.checkWinX(values))
            {
                System.out.print("X's Win!");
            }
            if (b1.checkWinNone(values))
            {
                System.out.print("No Winner.");
            }
        }
    }
}
