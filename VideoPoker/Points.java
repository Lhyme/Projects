import java.util.ArrayList;
import java.util.Collections;
public class Points
{   
    public Points()
    {

    }

    public void sort(ArrayList<Card> x)
    {
        if ((x.get(0).getValueIndex() > x.get(1).getValueIndex()) && (x.get(0).getValueIndex() > x.get(2).getValueIndex()) && (x.get(0).getValueIndex() > x.get(3).getValueIndex()) && (x.get(0).getValueIndex() > x.get(4).getValueIndex()))
        {
            Collections.swap(x, 0, 4);
        }
        else if ((x.get(1).getValueIndex() > x.get(0).getValueIndex()) && (x.get(1).getValueIndex() > x.get(2).getValueIndex()) && (x.get(1).getValueIndex() > x.get(3).getValueIndex()) && (x.get(1).getValueIndex() > x.get(4).getValueIndex()))
        {
            Collections.swap(x, 1, 4);
        }
        else if ((x.get(2).getValueIndex() > x.get(0).getValueIndex()) && (x.get(2).getValueIndex() > x.get(1).getValueIndex()) && (x.get(2).getValueIndex() > x.get(3).getValueIndex()) && (x.get(2).getValueIndex() > x.get(4).getValueIndex()))
        {
            Collections.swap(x, 2, 4);
        }
        else if ((x.get(3).getValueIndex() > x.get(0).getValueIndex()) && (x.get(3).getValueIndex() > x.get(1).getValueIndex()) && (x.get(3).getValueIndex() > x.get(2).getValueIndex()) && (x.get(3).getValueIndex() > x.get(4).getValueIndex()))
        {
            Collections.swap(x, 3, 4);
        }

        if ((x.get(0).getValueIndex() > x.get(1).getValueIndex()) && (x.get(0).getValueIndex() > x.get(2).getValueIndex()) && (x.get(0).getValueIndex() > x.get(3).getValueIndex()))
        {
            Collections.swap(x, 0, 3);
        }
        else if ((x.get(1).getValueIndex() > x.get(0).getValueIndex()) && (x.get(1).getValueIndex() > x.get(2).getValueIndex()) && (x.get(1).getValueIndex() > x.get(3).getValueIndex()))
        {
            Collections.swap(x, 1, 3);
        }
        else if ((x.get(2).getValueIndex() > x.get(0).getValueIndex()) && (x.get(2).getValueIndex() > x.get(1).getValueIndex()) && (x.get(2).getValueIndex() > x.get(3).getValueIndex()))
        {
            Collections.swap(x, 2, 3);
        }

        if ((x.get(0).getValueIndex() > x.get(1).getValueIndex()) && (x.get(0).getValueIndex() > x.get(2).getValueIndex()))
        {
            Collections.swap(x, 0, 2);
        }
        else if ((x.get(1).getValueIndex() > x.get(0).getValueIndex()) && (x.get(1).getValueIndex() > x.get(2).getValueIndex()))
        {
            Collections.swap(x, 1, 2);
        }

        if ((x.get(0).getValueIndex() > x.get(1).getValueIndex()))
        {
            Collections.swap(x, 0, 1);
        }

        if ( (x.get(0).getValueIndex() > x.get(1).getValueIndex()) || (x.get(1).getValueIndex() > x.get(2).getValueIndex()) || (x.get(2).getValueIndex() > x.get(3).getValueIndex()) || (x.get(3).getValueIndex() > x.get(4).getValueIndex()) )
        {
            while ( (x.get(0).getValueIndex() < x.get(1).getValueIndex()) && (x.get(1).getValueIndex() < x.get(2).getValueIndex()) && (x.get(2).getValueIndex() < x.get(3).getValueIndex()) && (x.get(3).getValueIndex() < x.get(4).getValueIndex()))
            {
                if ((x.get(1).getValueIndex() < x.get(0).getValueIndex()) && (x.get(1).getValueIndex() < x.get(2).getValueIndex()) && (x.get(1).getValueIndex() < x.get(3).getValueIndex()) && (x.get(1).getValueIndex() < x.get(4).getValueIndex()))
                {
                    Collections.swap(x, 1, 0);
                }
                else if ((x.get(2).getValueIndex() < x.get(0).getValueIndex()) && (x.get(2).getValueIndex() < x.get(1).getValueIndex()) && (x.get(2).getValueIndex() < x.get(3).getValueIndex()) && (x.get(2).getValueIndex() < x.get(4).getValueIndex()))
                {
                    Collections.swap(x, 2, 0);
                }
                else if ((x.get(3).getValueIndex() < x.get(0).getValueIndex()) && (x.get(3).getValueIndex() < x.get(1).getValueIndex()) && (x.get(3).getValueIndex() < x.get(2).getValueIndex()) && (x.get(3).getValueIndex() < x.get(4).getValueIndex()))
                {
                    Collections.swap(x, 3, 0);
                }
                else if ((x.get(4).getValueIndex() < x.get(0).getValueIndex()) && (x.get(4).getValueIndex() < x.get(1).getValueIndex()) && (x.get(4).getValueIndex() < x.get(2).getValueIndex()) && (x.get(4).getValueIndex() < x.get(3).getValueIndex()))
                {
                    Collections.swap(x, 4, 0);
                }

                if ((x.get(2).getValueIndex() < x.get(1).getValueIndex()) && (x.get(2).getValueIndex() < x.get(3).getValueIndex()) && (x.get(2).getValueIndex() < x.get(4).getValueIndex()))
                {
                    Collections.swap(x, 2, 1);
                }
                else if ((x.get(3).getValueIndex() < x.get(1).getValueIndex()) && (x.get(3).getValueIndex() < x.get(2).getValueIndex()) && (x.get(3).getValueIndex() < x.get(4).getValueIndex()))
                {
                    Collections.swap(x, 3, 1);
                }
                else if ((x.get(4).getValueIndex() < x.get(1).getValueIndex()) && (x.get(4).getValueIndex() < x.get(2).getValueIndex()) && (x.get(4).getValueIndex() < x.get(3).getValueIndex()))
                {
                    Collections.swap(x, 4, 1);
                }

                if ((x.get(3).getValueIndex() < x.get(2).getValueIndex()) && (x.get(3).getValueIndex() < x.get(4).getValueIndex()))
                {
                    Collections.swap(x, 3, 2);
                }
                else if ((x.get(4).getValueIndex() < x.get(2).getValueIndex()) && (x.get(4).getValueIndex() < x.get(3).getValueIndex()))
                {
                    Collections.swap(x, 4, 2);
                }

                if ((x.get(4).getValueIndex() > x.get(3).getValueIndex()))
                {
                    Collections.swap(x, 4, 3);
                }
            }
        }
    }

    public boolean onePair(ArrayList<Card> x)
    {
        boolean onePair = false;

        if ((x.get(0).getValue() == "Ace") && (x.get(1).getValue() == "Ace" || x.get(2).getValue() == "Ace" || x.get(3).getValue() == "Ace" || x.get(4).getValue() == "Ace") ||
        (x.get(1).getValue() == "Ace") && (x.get(0).getValue() == "Ace" || x.get(2).getValue() == "Ace" || x.get(3).getValue() == "Ace" || x.get(4).getValue() == "Ace") ||
        (x.get(2).getValue() == "Ace") && (x.get(0).getValue() == "Ace" || x.get(1).getValue() == "Ace" || x.get(3).getValue() == "Ace" || x.get(4).getValue() == "Ace") ||
        (x.get(3).getValue() == "Ace") && (x.get(0).getValue() == "Ace" || x.get(1).getValue() == "Ace" || x.get(2).getValue() == "Ace" || x.get(4).getValue() == "Ace") ||
        (x.get(4).getValue() == "Ace") && (x.get(0).getValue() == "Ace" || x.get(1).getValue() == "Ace" || x.get(2).getValue() == "Ace" || x.get(3).getValue() == "Ace"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Deuce") && (x.get(1).getValue() == "Deuce" || x.get(2).getValue() == "Deuce" || x.get(3).getValue() == "Deuce" || x.get(4).getValue() == "Deuce") ||
        (x.get(1).getValue() == "Deuce") && (x.get(0).getValue() == "Deuce" || x.get(2).getValue() == "Deuce" || x.get(3).getValue() == "Deuce" || x.get(4).getValue() == "Deuce") ||
        (x.get(2).getValue() == "Deuce") && (x.get(0).getValue() == "Deuce" || x.get(1).getValue() == "Deuce" || x.get(3).getValue() == "Deuce" || x.get(4).getValue() == "Deuce") ||
        (x.get(3).getValue() == "Deuce") && (x.get(0).getValue() == "Deuce" || x.get(1).getValue() == "Deuce" || x.get(2).getValue() == "Deuce" || x.get(4).getValue() == "Deuce") ||
        (x.get(4).getValue() == "Deuce") && (x.get(0).getValue() == "Deuce" || x.get(1).getValue() == "Deuce" || x.get(2).getValue() == "Deuce" || x.get(3).getValue() == "Deuce"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Three") && (x.get(1).getValue() == "Three" || x.get(2).getValue() == "Three" || x.get(3).getValue() == "Three" || x.get(4).getValue() == "Three") ||
        (x.get(1).getValue() == "Three") && (x.get(0).getValue() == "Three" || x.get(2).getValue() == "Three" || x.get(3).getValue() == "Three" || x.get(4).getValue() == "Three") ||
        (x.get(2).getValue() == "Three") && (x.get(0).getValue() == "Three" || x.get(1).getValue() == "Three" || x.get(3).getValue() == "Three" || x.get(4).getValue() == "Three") ||
        (x.get(3).getValue() == "Three") && (x.get(0).getValue() == "Three" || x.get(1).getValue() == "Three" || x.get(2).getValue() == "Three" || x.get(4).getValue() == "Three") ||
        (x.get(4).getValue() == "Three") && (x.get(0).getValue() == "Three" || x.get(1).getValue() == "Three" || x.get(2).getValue() == "Three" || x.get(3).getValue() == "Three"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Four") && (x.get(1).getValue() == "Four" || x.get(2).getValue() == "Four" || x.get(3).getValue() == "Four" || x.get(4).getValue() == "Four") ||
        (x.get(1).getValue() == "Four") && (x.get(0).getValue() == "Four" || x.get(2).getValue() == "Four" || x.get(3).getValue() == "Four" || x.get(4).getValue() == "Four") ||
        (x.get(2).getValue() == "Four") && (x.get(0).getValue() == "Four" || x.get(1).getValue() == "Four" || x.get(3).getValue() == "Four" || x.get(4).getValue() == "Four") ||
        (x.get(3).getValue() == "Four") && (x.get(0).getValue() == "Four" || x.get(1).getValue() == "Four" || x.get(2).getValue() == "Four" || x.get(4).getValue() == "Four") ||
        (x.get(4).getValue() == "Four") && (x.get(0).getValue() == "Four" || x.get(1).getValue() == "Four" || x.get(2).getValue() == "Four" || x.get(3).getValue() == "Four"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Five") && (x.get(1).getValue() == "Five" || x.get(2).getValue() == "Five" || x.get(3).getValue() == "Five" || x.get(4).getValue() == "Five") ||
        (x.get(1).getValue() == "Five") && (x.get(0).getValue() == "Five" || x.get(2).getValue() == "Five" || x.get(3).getValue() == "Five" || x.get(4).getValue() == "Five") ||
        (x.get(2).getValue() == "Five") && (x.get(0).getValue() == "Five" || x.get(1).getValue() == "Five" || x.get(3).getValue() == "Five" || x.get(4).getValue() == "Five") ||
        (x.get(3).getValue() == "Five") && (x.get(0).getValue() == "Five" || x.get(1).getValue() == "Five" || x.get(2).getValue() == "Five" || x.get(4).getValue() == "Five") ||
        (x.get(4).getValue() == "Five") && (x.get(0).getValue() == "Five" || x.get(1).getValue() == "Five" || x.get(2).getValue() == "Five" || x.get(3).getValue() == "Five"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Six") && (x.get(1).getValue() == "Six" || x.get(2).getValue() == "Six" || x.get(3).getValue() == "Six" || x.get(4).getValue() == "Six") ||
        (x.get(1).getValue() == "Six") && (x.get(0).getValue() == "Six" || x.get(2).getValue() == "Six" || x.get(3).getValue() == "Six" || x.get(4).getValue() == "Six") ||
        (x.get(2).getValue() == "Six") && (x.get(0).getValue() == "Six" || x.get(1).getValue() == "Six" || x.get(3).getValue() == "Six" || x.get(4).getValue() == "Six") ||
        (x.get(3).getValue() == "Six") && (x.get(0).getValue() == "Six" || x.get(1).getValue() == "Six" || x.get(2).getValue() == "Six" || x.get(4).getValue() == "Six") ||
        (x.get(4).getValue() == "Six") && (x.get(0).getValue() == "Six" || x.get(1).getValue() == "Six" || x.get(2).getValue() == "Six" || x.get(3).getValue() == "Six"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Seven") && (x.get(1).getValue() == "Seven" || x.get(2).getValue() == "Seven" || x.get(3).getValue() == "Seven" || x.get(4).getValue() == "Seven") ||
        (x.get(1).getValue() == "Seven") && (x.get(0).getValue() == "Seven" || x.get(2).getValue() == "Seven" || x.get(3).getValue() == "Seven" || x.get(4).getValue() == "Seven") ||
        (x.get(2).getValue() == "Seven") && (x.get(0).getValue() == "Seven" || x.get(1).getValue() == "Seven" || x.get(3).getValue() == "Seven" || x.get(4).getValue() == "Seven") ||
        (x.get(3).getValue() == "Seven") && (x.get(0).getValue() == "Seven" || x.get(1).getValue() == "Seven" || x.get(2).getValue() == "Seven" || x.get(4).getValue() == "Seven") ||
        (x.get(4).getValue() == "Seven") && (x.get(0).getValue() == "Seven" || x.get(1).getValue() == "Seven" || x.get(2).getValue() == "Seven" || x.get(3).getValue() == "Seven"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Eight") && (x.get(1).getValue() == "Eight" || x.get(2).getValue() == "Eight" || x.get(3).getValue() == "Eight" || x.get(4).getValue() == "Eight") ||
        (x.get(1).getValue() == "Eight") && (x.get(0).getValue() == "Eight" || x.get(2).getValue() == "Eight" || x.get(3).getValue() == "Eight" || x.get(4).getValue() == "Eight") ||
        (x.get(2).getValue() == "Eight") && (x.get(0).getValue() == "Eight" || x.get(1).getValue() == "Eight" || x.get(3).getValue() == "Eight" || x.get(4).getValue() == "Eight") ||
        (x.get(3).getValue() == "Eight") && (x.get(0).getValue() == "Eight" || x.get(1).getValue() == "Eight" || x.get(2).getValue() == "Eight" || x.get(4).getValue() == "Eight") ||
        (x.get(4).getValue() == "Eight") && (x.get(0).getValue() == "Eight" || x.get(1).getValue() == "Eight" || x.get(2).getValue() == "Eight" || x.get(3).getValue() == "Eight"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Nine") && (x.get(1).getValue() == "Nine" || x.get(2).getValue() == "Nine" || x.get(3).getValue() == "Nine" || x.get(4).getValue() == "Nine") ||
        (x.get(1).getValue() == "Nine") && (x.get(0).getValue() == "Nine" || x.get(2).getValue() == "Nine" || x.get(3).getValue() == "Nine" || x.get(4).getValue() == "Nine") ||
        (x.get(2).getValue() == "Nine") && (x.get(0).getValue() == "Nine" || x.get(1).getValue() == "Nine" || x.get(3).getValue() == "Nine" || x.get(4).getValue() == "Nine") ||
        (x.get(3).getValue() == "Nine") && (x.get(0).getValue() == "Nine" || x.get(1).getValue() == "Nine" || x.get(2).getValue() == "Nine" || x.get(4).getValue() == "Nine") ||
        (x.get(4).getValue() == "Nine") && (x.get(0).getValue() == "Nine" || x.get(1).getValue() == "Nine" || x.get(2).getValue() == "Nine" || x.get(3).getValue() == "Nine"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Ten") && (x.get(1).getValue() == "Ten" || x.get(2).getValue() == "Ten" || x.get(3).getValue() == "Ten" || x.get(4).getValue() == "Ten") ||
        (x.get(1).getValue() == "Ten") && (x.get(0).getValue() == "Ten" || x.get(2).getValue() == "Ten" || x.get(3).getValue() == "Ten" || x.get(4).getValue() == "Ten") ||
        (x.get(2).getValue() == "Ten") && (x.get(0).getValue() == "Ten" || x.get(1).getValue() == "Ten" || x.get(3).getValue() == "Ten" || x.get(4).getValue() == "Ten") ||
        (x.get(3).getValue() == "Ten") && (x.get(0).getValue() == "Ten" || x.get(1).getValue() == "Ten" || x.get(2).getValue() == "Ten" || x.get(4).getValue() == "Ten") ||
        (x.get(4).getValue() == "Ten") && (x.get(0).getValue() == "Ten" || x.get(1).getValue() == "Ten" || x.get(2).getValue() == "Ten" || x.get(3).getValue() == "Ten"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Jack") && (x.get(1).getValue() == "Jack" || x.get(2).getValue() == "Jack" || x.get(3).getValue() == "Jack" || x.get(4).getValue() == "Jack") ||
        (x.get(1).getValue() == "Jack") && (x.get(0).getValue() == "Jack" || x.get(2).getValue() == "Jack" || x.get(3).getValue() == "Jack" || x.get(4).getValue() == "Jack") ||
        (x.get(2).getValue() == "Jack") && (x.get(0).getValue() == "Jack" || x.get(1).getValue() == "Jack" || x.get(3).getValue() == "Jack" || x.get(4).getValue() == "Jack") ||
        (x.get(3).getValue() == "Jack") && (x.get(0).getValue() == "Jack" || x.get(1).getValue() == "Jack" || x.get(2).getValue() == "Jack" || x.get(4).getValue() == "Jack") ||
        (x.get(4).getValue() == "Jack") && (x.get(0).getValue() == "Jack" || x.get(1).getValue() == "Jack" || x.get(2).getValue() == "Jack" || x.get(3).getValue() == "Jack"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "Queen") && (x.get(1).getValue() == "Queen" || x.get(2).getValue() == "Queen" || x.get(3).getValue() == "Queen" || x.get(4).getValue() == "Queen") ||
        (x.get(1).getValue() == "Queen") && (x.get(0).getValue() == "Queen" || x.get(2).getValue() == "Queen" || x.get(3).getValue() == "Queen" || x.get(4).getValue() == "Queen") ||
        (x.get(2).getValue() == "Queen") && (x.get(0).getValue() == "Queen" || x.get(1).getValue() == "Queen" || x.get(3).getValue() == "Queen" || x.get(4).getValue() == "Queen") ||
        (x.get(3).getValue() == "Queen") && (x.get(0).getValue() == "Queen" || x.get(1).getValue() == "Queen" || x.get(2).getValue() == "Queen" || x.get(4).getValue() == "Queen") ||
        (x.get(4).getValue() == "Queen") && (x.get(0).getValue() == "Queen" || x.get(1).getValue() == "Queen" || x.get(2).getValue() == "Queen" || x.get(3).getValue() == "Queen"))
        {
            onePair = true;
        }

        if ((x.get(0).getValue() == "King") && (x.get(1).getValue() == "King" || x.get(2).getValue() == "King" || x.get(3).getValue() == "King" || x.get(4).getValue() == "King") ||
        (x.get(1).getValue() == "King") && (x.get(0).getValue() == "King" || x.get(2).getValue() == "King" || x.get(3).getValue() == "King" || x.get(4).getValue() == "King") ||
        (x.get(2).getValue() == "King") && (x.get(0).getValue() == "King" || x.get(1).getValue() == "King" || x.get(3).getValue() == "King" || x.get(4).getValue() == "King") ||
        (x.get(3).getValue() == "King") && (x.get(0).getValue() == "King" || x.get(1).getValue() == "King" || x.get(2).getValue() == "King" || x.get(4).getValue() == "King") ||
        (x.get(4).getValue() == "King") && (x.get(0).getValue() == "King" || x.get(1).getValue() == "King" || x.get(2).getValue() == "King" || x.get(3).getValue() == "King"))
        {
            onePair = true;
        }

        return onePair;
    }
    
    public boolean threeKind(ArrayList<Card> x)
    {
        boolean threeKind = false;

        if ( ((x.get(0).getValue().equals(x.get(1).getValue())) && (x.get(0).getValue().equals(x.get(2).getValue()) || x.get(0).getValue().equals(x.get(3).getValue()) || x.get(0).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(0).getValue().equals(x.get(2).getValue())) && (x.get(0).getValue().equals(x.get(3).getValue()) || x.get(0).getValue().equals(x.get(1).getValue()) || x.get(0).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(0).getValue().equals(x.get(3).getValue())) && (x.get(0).getValue().equals(x.get(4).getValue()) || x.get(0).getValue().equals(x.get(1).getValue()) || x.get(0).getValue().equals(x.get(2).getValue()))) )
        {
            threeKind = true;
        }

        if ( ((x.get(1).getValue().equals(x.get(0).getValue())) && (x.get(1).getValue().equals(x.get(2).getValue()) || x.get(1).getValue().equals(x.get(3).getValue()) || x.get(1).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(1).getValue().equals(x.get(2).getValue())) && (x.get(1).getValue().equals(x.get(3).getValue()) || x.get(1).getValue().equals(x.get(0).getValue()) || x.get(1).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(1).getValue().equals(x.get(3).getValue())) && (x.get(1).getValue().equals(x.get(4).getValue()) || x.get(1).getValue().equals(x.get(0).getValue()) || x.get(1).getValue().equals(x.get(2).getValue()))) )
        {
            threeKind = true;
        }

        if ( ((x.get(2).getValue().equals(x.get(0).getValue())) && (x.get(2).getValue().equals(x.get(1).getValue()) || x.get(2).getValue().equals(x.get(3).getValue()) || x.get(2).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(2).getValue().equals(x.get(1).getValue())) && (x.get(2).getValue().equals(x.get(3).getValue()) || x.get(2).getValue().equals(x.get(0).getValue()) || x.get(2).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(2).getValue().equals(x.get(3).getValue())) && (x.get(2).getValue().equals(x.get(4).getValue()) || x.get(2).getValue().equals(x.get(0).getValue()) || x.get(2).getValue().equals(x.get(1).getValue()))) )
        {
            threeKind = true;
        }

        if ( ((x.get(3).getValue().equals(x.get(0).getValue())) && (x.get(3).getValue().equals(x.get(1).getValue()) || x.get(3).getValue().equals(x.get(2).getValue()) || x.get(3).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(3).getValue().equals(x.get(1).getValue())) && (x.get(3).getValue().equals(x.get(2).getValue()) || x.get(3).getValue().equals(x.get(0).getValue()) || x.get(3).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(3).getValue().equals(x.get(2).getValue())) && (x.get(3).getValue().equals(x.get(4).getValue()) || x.get(3).getValue().equals(x.get(0).getValue()) || x.get(3).getValue().equals(x.get(1).getValue()))) )
        {
            threeKind = true;
        }

        if ( ((x.get(4).getValue().equals(x.get(0).getValue())) && (x.get(4).getValue().equals(x.get(1).getValue()) || x.get(4).getValue().equals(x.get(2).getValue()) || x.get(3).getValue().equals(x.get(4).getValue()))) ||
        ((x.get(4).getValue().equals(x.get(1).getValue())) && (x.get(4).getValue().equals(x.get(2).getValue()) || x.get(4).getValue().equals(x.get(0).getValue()) || x.get(4).getValue().equals(x.get(3).getValue()))) ||
        ((x.get(4).getValue().equals(x.get(2).getValue())) && (x.get(4).getValue().equals(x.get(3).getValue()) || x.get(4).getValue().equals(x.get(0).getValue()) || x.get(4).getValue().equals(x.get(1).getValue()))) )
        {
            threeKind = true;
        }

        return threeKind;
    }

    public boolean straight(ArrayList<Card> x)
    {
        boolean straight = false;
        int j = 1;

        sort(x);
        for (int i = 0; i < 4; i++)
        {
            if ((x.get(i).getValueIndex() + 1) == (x.get(j).getValueIndex()))
            {
                straight = true;
            }
            else
            {
                straight = false;
                break;
            }
            j++;
        }

        return straight;
    }

    public boolean flush(ArrayList<Card> x)
    {
        boolean flush = false;

        if (x.get(0).getSuit() == "Clubs" && x.get(1).getSuit() == "Clubs" && x.get(2).getSuit() == "Clubs" && x.get(3).getSuit() == "Clubs" && x.get(4).getSuit() == "Clubs")
        {
            flush = true;
        }
        if (x.get(0).getSuit() == "Spades" && x.get(1).getSuit() == "Spades" && x.get(2).getSuit() == "Spades" && x.get(3).getSuit() == "Spades" && x.get(4).getSuit() == "Spades")
        {
            flush = true;
        }
        if (x.get(0).getSuit() == "Hearts" && x.get(1).getSuit() == "Hearts" && x.get(2).getSuit() == "Hearts" && x.get(3).getSuit() == "Hearts" && x.get(4).getSuit() == "Hearts")
        {
            flush = true;
        }
        if (x.get(0).getSuit() == "Diamonds" && x.get(1).getSuit() == "Diamonds" && x.get(2).getSuit() == "Diamonds" && x.get(3).getSuit() == "Diamonds" && x.get(4).getSuit() == "Diamonds")
        {
            flush = true;
        }

        return flush;
    }

    public boolean fullHouse(ArrayList<Card> x)
    {
        boolean fullhouse = false;

        if ((x.get(0).getValue().equals(x.get(1).getValue())) && (x.get(2).getValue().equals(x.get(3).getValue()) && x.get(2).getValue().equals(x.get(4).getValue())) ||
        (x.get(0).getValue().equals(x.get(2).getValue())) && (x.get(1).getValue().equals(x.get(3).getValue()) && x.get(1).getValue().equals(x.get(4).getValue())) ||
        (x.get(0).getValue().equals(x.get(3).getValue())) && (x.get(1).getValue().equals(x.get(2).getValue()) && x.get(1).getValue().equals(x.get(4).getValue())) ||
        (x.get(0).getValue().equals(x.get(4).getValue())) && (x.get(1).getValue().equals(x.get(2).getValue()) && x.get(1).getValue().equals(x.get(3).getValue())))
        {
            fullhouse = true;
        }

        if ((x.get(1).getValue().equals(x.get(0).getValue())) && (x.get(2).getValue().equals(x.get(3).getValue()) && x.get(2).getValue().equals(x.get(4).getValue())) ||
        (x.get(1).getValue().equals(x.get(2).getValue())) && (x.get(0).getValue().equals(x.get(3).getValue()) && x.get(0).getValue().equals(x.get(4).getValue())) ||
        (x.get(1).getValue().equals(x.get(3).getValue())) && (x.get(0).getValue().equals(x.get(2).getValue()) && x.get(0).getValue().equals(x.get(4).getValue())) ||
        (x.get(1).getValue().equals(x.get(4).getValue())) && (x.get(0).getValue().equals(x.get(2).getValue()) && x.get(0).getValue().equals(x.get(3).getValue())))
        {
            fullhouse = true;
        }

        if ((x.get(2).getValue().equals(x.get(0).getValue())) && (x.get(1).getValue().equals(x.get(3).getValue()) && x.get(1).getValue().equals(x.get(4).getValue())) ||
        (x.get(2).getValue().equals(x.get(1).getValue())) && (x.get(0).getValue().equals(x.get(3).getValue()) && x.get(0).getValue().equals(x.get(4).getValue())) ||
        (x.get(2).getValue().equals(x.get(3).getValue())) && (x.get(0).getValue().equals(x.get(1).getValue()) && x.get(0).getValue().equals(x.get(4).getValue())) ||
        (x.get(2).getValue().equals(x.get(4).getValue())) && (x.get(0).getValue().equals(x.get(1).getValue()) && x.get(0).getValue().equals(x.get(3).getValue())))
        {
            fullhouse = true;
        }

        if ((x.get(3).getValue().equals(x.get(0).getValue())) && (x.get(1).getValue().equals(x.get(2).getValue()) && x.get(1).getValue().equals(x.get(4).getValue())) ||
        (x.get(3).getValue().equals(x.get(1).getValue())) && (x.get(0).getValue().equals(x.get(2).getValue()) && x.get(0).getValue().equals(x.get(4).getValue())) ||
        (x.get(3).getValue().equals(x.get(2).getValue())) && (x.get(0).getValue().equals(x.get(1).getValue()) && x.get(0).getValue().equals(x.get(4).getValue())) ||
        (x.get(3).getValue().equals(x.get(4).getValue())) && (x.get(0).getValue().equals(x.get(1).getValue()) && x.get(0).getValue().equals(x.get(2).getValue())))
        {
            fullhouse = true;
        }

        if ((x.get(4).getValue().equals(x.get(0).getValue())) && (x.get(1).getValue().equals(x.get(2).getValue()) && x.get(1).getValue().equals(x.get(3).getValue())) ||
        (x.get(4).getValue().equals(x.get(1).getValue())) && (x.get(0).getValue().equals(x.get(2).getValue()) && x.get(0).getValue().equals(x.get(3).getValue())) ||
        (x.get(4).getValue().equals(x.get(2).getValue())) && (x.get(0).getValue().equals(x.get(1).getValue()) && x.get(0).getValue().equals(x.get(3).getValue())) ||
        (x.get(4).getValue().equals(x.get(3).getValue())) && (x.get(0).getValue().equals(x.get(1).getValue()) && x.get(0).getValue().equals(x.get(2).getValue())))
        {
            fullhouse = true;
        }

        return fullhouse;
    }

    public boolean fourKind(ArrayList<Card> x)
    {
        boolean fourKind = false;

        if ((((x.get(0).getValue().equals(x.get(1).getValue())) && (x.get(0).getValue().equals(x.get(2).getValue()))) && (x.get(0).getValue().equals(x.get(3).getValue()) || x.get(0).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(0).getValue().equals(x.get(2).getValue())) && (x.get(0).getValue().equals(x.get(3).getValue()))) && (x.get(0).getValue().equals(x.get(1).getValue()) || x.get(0).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(0).getValue().equals(x.get(3).getValue())) && (x.get(0).getValue().equals(x.get(4).getValue()))) && (x.get(0).getValue().equals(x.get(1).getValue()) || x.get(0).getValue().equals(x.get(2).getValue()))))
        {
            fourKind = true;
        }

        if ((((x.get(1).getValue().equals(x.get(0).getValue())) && (x.get(1).getValue().equals(x.get(2).getValue()))) && (x.get(1).getValue().equals(x.get(3).getValue()) || x.get(1).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(1).getValue().equals(x.get(2).getValue())) && (x.get(1).getValue().equals(x.get(3).getValue()))) && (x.get(1).getValue().equals(x.get(0).getValue()) || x.get(1).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(1).getValue().equals(x.get(3).getValue())) && (x.get(1).getValue().equals(x.get(4).getValue()))) && (x.get(1).getValue().equals(x.get(0).getValue()) || x.get(1).getValue().equals(x.get(2).getValue()))))
        {
            fourKind = true;
        }

        if ((((x.get(2).getValue().equals(x.get(0).getValue())) && (x.get(2).getValue().equals(x.get(1).getValue()))) && (x.get(2).getValue().equals(x.get(3).getValue()) || x.get(2).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(2).getValue().equals(x.get(1).getValue())) && (x.get(2).getValue().equals(x.get(3).getValue()))) && (x.get(2).getValue().equals(x.get(0).getValue()) || x.get(2).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(2).getValue().equals(x.get(3).getValue())) && (x.get(2).getValue().equals(x.get(4).getValue()))) && (x.get(2).getValue().equals(x.get(0).getValue()) || x.get(2).getValue().equals(x.get(1).getValue()))))
        {
            fourKind = true;
        }

        if ((((x.get(3).getValue().equals(x.get(0).getValue())) && (x.get(3).getValue().equals(x.get(1).getValue()))) && (x.get(3).getValue().equals(x.get(2).getValue()) || x.get(3).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(3).getValue().equals(x.get(1).getValue())) && (x.get(3).getValue().equals(x.get(2).getValue()))) && (x.get(3).getValue().equals(x.get(0).getValue()) || x.get(3).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(3).getValue().equals(x.get(2).getValue())) && (x.get(3).getValue().equals(x.get(4).getValue()))) && (x.get(3).getValue().equals(x.get(0).getValue()) || x.get(3).getValue().equals(x.get(1).getValue()))))
        {
            fourKind = true;
        }

        if ((((x.get(4).getValue().equals(x.get(0).getValue())) && (x.get(4).getValue().equals(x.get(1).getValue()))) && (x.get(4).getValue().equals(x.get(2).getValue()) || x.get(3).getValue().equals(x.get(4).getValue()))) ||
        (((x.get(4).getValue().equals(x.get(1).getValue())) && (x.get(4).getValue().equals(x.get(2).getValue()))) && (x.get(4).getValue().equals(x.get(0).getValue()) || x.get(4).getValue().equals(x.get(3).getValue()))) ||
        (((x.get(4).getValue().equals(x.get(2).getValue())) && (x.get(4).getValue().equals(x.get(3).getValue()))) && (x.get(4).getValue().equals(x.get(0).getValue()) || x.get(4).getValue().equals(x.get(1).getValue()))))
        {
            fourKind = true;
        }

        return fourKind;
    }

    public boolean straightFlush(ArrayList<Card> x)
    {
        boolean straight = false;
        int j = 1;

        sort(x);
        if (x.get(0).getSuit().equals(x.get(1).getSuit()) && x.get(0).getSuit().equals(x.get(2).getSuit()) && x.get(0).getSuit().equals(x.get(3).getSuit()) && x.get(0).getSuit().equals(x.get(4).getSuit()))
        {
            for (int i = 0; i < 4; i++)
            {
                if ((x.get(i).getValueIndex() + 1) == (x.get(j).getValueIndex()))
                {
                    straight = true;
                }
                else
                {
                    straight = false;
                    break;
                }
                j++;
            }
        }

        return straight;
    }

    public boolean royalFlush(ArrayList<Card> x)
    {
        boolean royalFlush = false;

        if (x.get(0).getSuit().equals(x.get(1).getSuit()) && x.get(0).getSuit().equals(x.get(2).getSuit()) && x.get(0).getSuit().equals(x.get(3).getSuit()) && x.get(0).getSuit().equals(x.get(4).getSuit()))
        {
            if ((x.get(0).getValue() == "Ten" || x.get(1).getValue() == "Ten" || x.get(2).getValue() == "Ten" || x.get(3).getValue() == "Ten" || x.get(4).getValue() == "Ten") &&
            (x.get(0).getValue() == "Jack" || x.get(1).getValue() == "Jack" || x.get(2).getValue() == "Jack" || x.get(3).getValue() == "Jack" || x.get(4).getValue() == "Jack") &&
            (x.get(0).getValue() == "Queen" || x.get(1).getValue() == "Queen" || x.get(2).getValue() == "Queen" || x.get(3).getValue() == "Queen" || x.get(4).getValue() == "Queen") &&
            (x.get(0).getValue() == "King" || x.get(1).getValue() == "King" || x.get(2).getValue() == "King" || x.get(3).getValue() == "King" || x.get(4).getValue() == "King") &&
            (x.get(0).getValue() == "Ace" || x.get(1).getValue() == "Ace" || x.get(2).getValue() == "Ace" || x.get(3).getValue() == "Ace" || x.get(4).getValue() == "Ace"))
            {
                royalFlush = true;
            }
        }

        return royalFlush;
    }
    
    public boolean checkAny(ArrayList<Card> x)
    {
        boolean any = false;
        
        if (onePair(x) || threeKind(x) || straight(x) || flush(x) || fullHouse(x) || fourKind(x) || straightFlush(x) || royalFlush(x))
        {
            any = true;
        }
        else
        {
            any = false;
        }
        
        return any;
    }
}
