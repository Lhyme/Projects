import java.util.Scanner;
public class Board
{
    Scanner scan = new Scanner(System.in);

    public Board()
    {

    }

    public int nextSpace(String[][] x, int column)
    {
        int row = 0;

        for (int i = 5; i > 0; i--)
        {
            if (x[i][column] == "_ ")
            {
                row = i;
                break;
            }
        }

        return row;
    }
    
    public boolean checkColumn(String[][] x, int column)
    {
        boolean checkColumn = false;
        int row;
        
        for (int i = 5; i >= 0; i--)
        {
            if (x[i][column] != "_ ")
            {
                checkColumn = true;
            }
            else 
            {
                checkColumn = false;
                break;
            }
        }
        
        return checkColumn;
    }

    public boolean checkFull(String[][] x)
    {
        boolean full = false;

        if (x[0][0] != "_ " && x[0][1] != "_ " && x[0][2] != "_ " && x[0][3] != "_ " && x[0][4] != "_ " && x[0][5] != "_ " && x[0][6] != "_ ")
        {
            full = true;
        }

        return full;
    }
}