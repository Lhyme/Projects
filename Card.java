public class Card
{
    private int value;
    private int suit;
    private String values[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    private String suits[] = { "Clubs", "Spades", "Hearts", "Diamonds" };

    public Card(int cardValue, int cardSuit)
    {
        value = cardValue;
        suit = cardSuit;
    }

    public String getValue()
    {
        return values[value];
    }

    public int getValueIndex()
    {
        return value;
    }

    public String getSuit()
    {
        return suits[suit];
    }

    public int getSuitIndex()
    {
        return suit;
    }

    public String getCard()
    {
        return values[value] + " of " + suits[suit];
    }
}
