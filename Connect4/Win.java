public class Win
{
    public Win()
    {

    }

    public boolean checkWinBlack(String[][] x)
    {
        boolean win = false;
        
        if (checkWinBlack1(x) || checkWinBlack2(x) || checkWinBlack3(x))
        {
            win = true;
        }
        
        return win;
    }
    
    public boolean checkWinWhite(String[][] x)
    {
        boolean win = false;
        
        if (checkWinWhite1(x) || checkWinWhite2(x) || checkWinWhite3(x))
        {
            win = true;
        }
        
        return win;
    }
    
    public boolean checkWinBlack1(String[][] x)
    {
        boolean win = false;
        int count = 0;

        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x[0].length; j++)
            {
                if (x[i][j] == "■ ")
                {
                    count++;
                }
                else 
                {
                    count = 0;
                }
                if (count == 4)
                {
                    win = true;
                    break;
                }
            }
        }

        return win;
    }

    public boolean checkWinWhite1(String[][] x)
    {
        boolean win = false;
        int count = 0;

        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x[0].length; j++)
            {
                if (x[i][j] == "□ ")
                {
                    count++;
                }
                else 
                {
                    count = 0;
                }
                if (count == 4)
                {
                    win = true;
                    break;
                }
            }
        }

        return win;
    }

    public boolean checkWinBlack2(String[][] x)
    {
        boolean win = false;
        int count = 0;
        
        for (int i = 5; i > 0; i--)
        {
            if (x[i][0] == "■ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][1] == "■ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][2] == "■ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][3] == "■ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][4] == "■ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][5] == "■ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][6] == "■ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }

        return win;
    }
    
    public boolean checkWinWhite2(String[][] x)
    {
        boolean win = false;
        int count = 0;
        
        for (int i = 5; i > 0; i--)
        {
            if (x[i][0] == "□ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][1] == "□ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][2] == "□ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][3] == "□ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][4] == "□ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][5] == "□ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }
        for (int i = 5; i > 0; i--)
        {
            if (x[i][6] == "□ ")
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if (count == 4)
            {
                win = true;
                break;
            }
        }

        return win;
    }
    
    public boolean checkWinBlack3(String[][] x)
    {
        boolean win = false;
        
        int count1 = 0;
        int row1 = 4;
        int column1 = 0;
        int times1 = 0;
        
        int count2 = 0;
        int row2 = 5;
        int column2 = 0;
        int times2 = 0;
        
        int count3 = 0;
        int row3 = 5;
        int column3 = 1;
        int times3 = 0;
        
        int count4 = 0;
        int row4 = 5;
        int column4 = 2;
        int times4 = 0;
        
        int count5 = 0;
        int row5 = 5;
        int column5 = 3;
        int times5 = 0;
        
        if (x[3][0] == "■ " && x[2][1] == "■ " && x[1][2] == "■ " && x[0][3] == "■ ")
        {
            win = true;
        }
        while (times1 < 5)
        {
            if (x[row1][column1] == "■ ")
            {
                count1++;
            }
            else 
            {
                count1 = 0;
            }
            if (count1 == 4)
            {
                win = true;
                break;
            }
            row1--;
            column1++;
            times1++;
        }
        while (times2 < 6)
        {
            if (x[row2][column2] == "■ ")
            {
                count2++;
            }
            else
            {
                count2 = 0;
            }
            if (count2 == 4)
            {
                win = true;
                break;
            }
            row2--;
            column2++;
            times2++;
        }
        while (times3 < 6)
        {
            if (x[row3][column3] == "■ ")
            {
                count3++;
            }
            else
            {
                count3 = 0;
            }
            if (count3 == 4)
            {
                win = true;
                break;
            }
            row3--;
            column3++;
            times3++;
        }
        while (times4 < 5)
        {
            if (x[row4][column4] == "■ ")
            {
                count4++;
            }
            else
            {
                count4 = 0;
            }
            if (count4 == 4)
            {
                win = true;
                break;
            }
            row4--;
            column4++;
            times4++;
        }
        while (times5 < 4)
        {
            if (x[row5][column5] == "■ ")
            {
                count5++;
            }
            else
            {
                count5 = 0;
            }
            if (count5 == 4)
            {
                win = true;
                break;
            }
            row5--;
            column5++;
            times5++;
        }
        
        count1 = 0;
        row1 = 0;
        column1 = 2;
        times1 = 0;
        
        count2 = 0;
        row2 = 0;
        column2 = 1;
        times2 = 0;
        
        count3 = 0;
        row3 = 0;
        column3 = 0;
        times3 = 0;
        
        count4 = 0;
        row4 = 1;
        column4 = 0;
        times4 = 0;
        
        count5 = 0;
        row5 = 2;
        column5 = 0;
        times5 = 0;
        
        if (x[0][3] == "■ " && x[1][4] == "■ " && x[2][5] == "■ " && x[3][6] == "■ ")
        {
            win = true;
        }
        while (times1 < 5)
        {
            if (x[row1][column1] == "■ ")
            {
                count1++;
            }
            else 
            {
                count1 = 0;
            }
            if (count1 == 4)
            {
                win = true;
                break;
            }
            row1++;
            column1++;
            times1++;
        }
        while (times2 < 6)
        {
            if (x[row2][column2] == "■ ")
            {
                count2++;
            }
            else
            {
                count2 = 0;
            }
            if (count2 == 4)
            {
                win = true;
                break;
            }
            row2++;
            column2++;
            times2++;
        }
        while (times3 < 6)
        {
            if (x[row3][column3] == "■ ")
            {
                count3++;
            }
            else
            {
                count3 = 0;
            }
            if (count3 == 4)
            {
                win = true;
                break;
            }
            row3++;
            column3++;
            times3++;
        }
        while (times4 < 5)
        {
            if (x[row4][column4] == "■ ")
            {
                count4++;
            }
            else
            {
                count4 = 0;
            }
            if (count4 == 4)
            {
                win = true;
                break;
            }
            row4++;
            column4++;
            times4++;
        }
        while (times5 < 4)
        {
            if (x[row5][column5] == "■ ")
            {
                count5++;
            }
            else
            {
                count5 = 0;
            }
            if (count5 == 4)
            {
                win = true;
                break;
            }
            row5++;
            column5++;
            times5++;
        }
        
        return win;
    }
    
    public boolean checkWinWhite3(String[][] x)
    {
        boolean win = false;
        
        int count1 = 0;
        int row1 = 4;
        int column1 = 0;
        int times1 = 0;
        
        int count2 = 0;
        int row2 = 5;
        int column2 = 0;
        int times2 = 0;
        
        int count3 = 0;
        int row3 = 5;
        int column3 = 1;
        int times3 = 0;
        
        int count4 = 0;
        int row4 = 5;
        int column4 = 2;
        int times4 = 0;
        
        int count5 = 0;
        int row5 = 5;
        int column5 = 3;
        int times5 = 0;
        
        if (x[3][0] == "□ " && x[2][1] == "□ " && x[1][2] == "□ " && x[0][3] == "□ ")
        {
            win = true;
        }
        while (times1 < 5)
        {
            if (x[row1][column1] == "□ ")
            {
                count1++;
            }
            else 
            {
                count1 = 0;
            }
            if (count1 == 4)
            {
                win = true;
                break;
            }
            row1--;
            column1++;
            times1++;
        }
        while (times2 < 6)
        {
            if (x[row2][column2] == "□ ")
            {
                count2++;
            }
            else
            {
                count2 = 0;
            }
            if (count2 == 4)
            {
                win = true;
                break;
            }
            row2--;
            column2++;
            times2++;
        }
        while (times3 < 6)
        {
            if (x[row3][column3] == "□ ")
            {
                count3++;
            }
            else
            {
                count3 = 0;
            }
            if (count3 == 4)
            {
                win = true;
                break;
            }
            row3--;
            column3++;
            times3++;
        }
        while (times4 < 5)
        {
            if (x[row4][column4] == "□ ")
            {
                count4++;
            }
            else
            {
                count4 = 0;
            }
            if (count4 == 4)
            {
                win = true;
                break;
            }
            row4--;
            column4++;
            times4++;
        }
        while (times5 < 4)
        {
            if (x[row5][column5] == "□ ")
            {
                count5++;
            }
            else
            {
                count5 = 0;
            }
            if (count5 == 4)
            {
                win = true;
                break;
            }
            row5--;
            column5++;
            times5++;
        }
        
        count1 = 0;
        row1 = 0;
        column1 = 2;
        times1 = 0;
        
        count2 = 0;
        row2 = 0;
        column2 = 1;
        times2 = 0;
        
        count3 = 0;
        row3 = 0;
        column3 = 0;
        times3 = 0;
        
        count4 = 0;
        row4 = 1;
        column4 = 0;
        times4 = 0;
        
        count5 = 0;
        row5 = 2;
        column5 = 0;
        times5 = 0;
        
        if (x[0][3] == "□ " && x[1][4] == "□ " && x[2][5] == "□ " && x[3][6] == "□ ")
        {
            win = true;
        }
        while (times1 < 5)
        {
            if (x[row1][column1] == "□ ")
            {
                count1++;
            }
            else 
            {
                count1 = 0;
            }
            if (count1 == 4)
            {
                win = true;
                break;
            }
            row1++;
            column1++;
            times1++;
        }
        while (times2 < 6)
        {
            if (x[row2][column2] == "□ ")
            {
                count2++;
            }
            else
            {
                count2 = 0;
            }
            if (count2 == 4)
            {
                win = true;
                break;
            }
            row2++;
            column2++;
            times2++;
        }
        while (times3 < 6)
        {
            if (x[row3][column3] == "□ ")
            {
                count3++;
            }
            else
            {
                count3 = 0;
            }
            if (count3 == 4)
            {
                win = true;
                break;
            }
            row3++;
            column3++;
            times3++;
        }
        while (times4 < 5)
        {
            if (x[row4][column4] == "□ ")
            {
                count4++;
            }
            else
            {
                count4 = 0;
            }
            if (count4 == 4)
            {
                win = true;
                break;
            }
            row4++;
            column4++;
            times4++;
        }
        while (times5 < 4)
        {
            if (x[row5][column5] == "□ ")
            {
                count5++;
            }
            else
            {
                count5 = 0;
            }
            if (count5 == 4)
            {
                win = true;
                break;
            }
            row5++;
            column5++;
            times5++;
        }
        
        return win;
    }
}
