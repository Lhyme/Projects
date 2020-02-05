public class BoardMethods
{
    public BoardMethods()
    {

    }

    public boolean checkWinO(String[][] x)
    {
        boolean win = false;
        if (x[0][0] == "O " && x[0][1] == "O " && x[0][2] == "O ")
        {
            win = true;
        }
        else if (x[1][0] == "O " && x[1][1] == "O " && x[1][2] == "O ")
        {
            win = true;
        }
        else if (x[2][0] == "O " && x[2][1] == "O " && x[2][2] == "O ")
        {
            win = true;
        }

        else if (x[0][0] == "O " && x[1][0] == "O " && x[2][0] == "O ")
        {
            win = true;
        }
        else if (x[0][1] == "O " && x[1][1] == "O " && x[2][1] == "O ")
        {
            win = true;
        }
        else if (x[0][2] == "O " && x[1][2] == "O " && x[2][2] == "O ")
        {
            win = true;
        }

        else if (x[0][0] == "O " && x[1][1] == "O " && x[2][2] == "O ")
        {
            win = true;
        }
        else if (x[2][0] == "O " && x[1][1] == "O " && x[0][2] == "O ")
        {
            win = true;
        }
        else 
        {
            win = false;
        }
        return win;
    }

    public boolean checkWinX(String[][] x)
    {
        boolean win = false;
        if (x[0][0] == "X " && x[0][1] == "X " && x[0][2] == "X ")
        {
            win = true;
        }
        else if (x[1][0] == "X " && x[1][1] == "X " && x[1][2] == "X ")
        {
            win = true;
        }
        else if (x[2][0] == "X " && x[2][1] == "X " && x[2][2] == "X ")
        {
            win = true;
        }

        else if (x[0][0] == "X " && x[1][0] == "X " && x[2][0] == "X ")
        {
            win = true;
        }
        else if (x[0][1] == "X " && x[1][1] == "X " && x[2][1] == "X ")
        {
            win = true;
        }
        else if (x[0][2] == "X " && x[1][2] == "X " && x[2][2] == "X ")
        {
            win = true;
        }

        else if (x[0][0] == "X " && x[1][1] == "X " && x[2][2] == "X ")
        {
            win = true;
        }
        else if (x[2][0] == "X " && x[1][1] == "X " && x[0][2] == "X ")
        {
            win = true;
        }
        else 
        {
            win = false;
        }
        return win;
    }

    public boolean checkWinNone(String[][] x)
    {
        boolean win = false;
        if ((x[0][0] == "O " || x[0][0] == "X ") && 
        (x[0][1] == "O " || x[0][1] == "X ") && 
        (x[0][2] == "O " || x[0][2] == "X ") && 
        (x[1][0] == "O " || x[1][0] == "X ") && 
        (x[1][1] == "O " || x[1][1] == "X ") && 
        (x[1][2] == "O " || x[1][2] == "X ") && 
        (x[2][0] == "O " || x[2][0] == "X ") &&
        (x[2][1] == "O " || x[2][1] == "X ") &&
        (x[2][2] == "O " || x[2][2] == "X "))
        {
            win = true;
        }
        return win;
    }
}
