import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Points p1 = new Points();

        int tokens = 0;
        int end = -1;

        int[] rejects = new int[5];
        int rejectCard = -1;
        int rCount = 0;
        int cCount = 0;

        Card c1 = new Card(0, 0);
        Card c2 = new Card(1, 0);
        Card c3 = new Card(2, 0);
        Card c4 = new Card(3, 0);
        Card c5 = new Card(4, 0);

        Card c6 = new Card(5, 0);
        Card c7 = new Card(6, 0);
        Card c8 = new Card(7, 0);
        Card c9 = new Card(8, 0);
        Card c10 = new Card(9, 0);

        Card c11 = new Card(10, 0);
        Card c12 = new Card(11, 0);
        Card c13 = new Card(12, 0);

        Card c14 = new Card(0, 1);
        Card c15 = new Card(1, 1);
        Card c16 = new Card(2, 1);
        Card c17 = new Card(3, 1);
        Card c18 = new Card(4, 1);
        Card c19 = new Card(5, 1);
        Card c20 = new Card(6, 1);
        Card c21 = new Card(7, 1);
        Card c22 = new Card(8, 1);
        Card c23 = new Card(9, 1);
        Card c24 = new Card(10, 1);
        Card c25 = new Card(11, 1);
        Card c26 = new Card(12, 1);

        Card c27 = new Card(0, 2);
        Card c28 = new Card(1, 2);
        Card c29 = new Card(2, 2);
        Card c30 = new Card(3, 2);
        Card c31 = new Card(4, 2);
        Card c32 = new Card(5, 2);
        Card c33 = new Card(6, 2);
        Card c34 = new Card(7, 2);
        Card c35 = new Card(8, 2);
        Card c36 = new Card(9, 2);
        Card c37 = new Card(10, 2);
        Card c38 = new Card(11, 2);
        Card c39 = new Card(12, 2);

        Card c40 = new Card(0, 3);
        Card c41 = new Card(1, 3);
        Card c42 = new Card(2, 3);
        Card c43 = new Card(3, 3);
        Card c44 = new Card(4, 3);
        Card c45 = new Card(5, 3);
        Card c46 = new Card(6, 3);
        Card c47 = new Card(7, 3);
        Card c48 = new Card(8, 3);
        Card c49 = new Card(9, 3);
        Card c50 = new Card(10, 3);
        Card c51 = new Card(11, 3);
        Card c52 = new Card(12, 3);

        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(c1);
        cards.add(c2);
        cards.add(c3);
        cards.add(c4);
        cards.add(c5);
        cards.add(c6);
        cards.add(c7);
        cards.add(c8);
        cards.add(c9);
        cards.add(c10);
        cards.add(c11);
        cards.add(c12);
        cards.add(c13);
        cards.add(c14);
        cards.add(c15);
        cards.add(c16);
        cards.add(c17);
        cards.add(c18);
        cards.add(c19);
        cards.add(c20);
        cards.add(c21);
        cards.add(c22);
        cards.add(c23);
        cards.add(c24);
        cards.add(c25);
        cards.add(c26);
        cards.add(c27);
        cards.add(c28);
        cards.add(c29);
        cards.add(c30);
        cards.add(c31);
        cards.add(c32);
        cards.add(c33);
        cards.add(c34);
        cards.add(c35);
        cards.add(c36);
        cards.add(c37);
        cards.add(c38);
        cards.add(c39);
        cards.add(c40);
        cards.add(c41);
        cards.add(c42);
        cards.add(c43);
        cards.add(c44);
        cards.add(c45);
        cards.add(c46);
        cards.add(c47);
        cards.add(c48);
        cards.add(c49);
        cards.add(c50);
        cards.add(c51);
        cards.add(c52);

        //Card Shuffling
        for (int i = 0; i < cards.size(); i++)
        {
            int rCard = random.nextInt(51);
            Collections.swap(cards, i, rCard);
        }

        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(cards.get(0));
        deck.add(cards.get(1));
        deck.add(cards.get(2));
        deck.add(cards.get(3));
        deck.add(cards.get(4));

        //Starting Deck
        for (int i = 0; i < deck.size(); i++)
        {
            System.out.println(deck.get(i).getCard());
        }
        System.out.println();

        //Reject Cards
        System.out.print("Would you like to reject any cards? (0 = no, 1 = yes): ");
        int rejectNum = scan.nextInt();
        if (rejectNum == 1)
        {
            while (rejectCard != 0 && rCount != 5)
            {
                System.out.print("Which card would you like to reject? (0 to stop): ");
                rejectCard = scan.nextInt();

                if (rejectCard != 0)
                {
                    if (rejectCard == rejects[0] || rejectCard == rejects[1] || rejectCard == rejects[2] || rejectCard == rejects[3] || rejectCard == rejects[4])
                    {
                        while (rejectCard == rejects[0] || rejectCard == rejects[1] || rejectCard == rejects[2] || rejectCard == rejects[3] || rejectCard == rejects[4])
                        {
                            System.out.print("This card has already been rejected. Try again: ");
                            rejectCard = scan.nextInt();
                        }
                    }

                    deck.set(rejectCard - 1, cards.get(cCount + 5));
                    cCount++;
                    rejects[rCount] = rejectCard;
                    rCount++;

                    System.out.println();
                    for (Card i : deck)
                    {
                        System.out.println(i.getCard());
                    }
                    System.out.println();
                }
            }
        }

        //Card Points
        System.out.println();
        if (p1.checkAny(deck))
        {
            System.out.println("Rewards: ");

            if (p1.royalFlush(deck))
            {
                System.out.println("Royal Flush. (+250 Tokens)");
                tokens += 250;
            }
            else if (p1.straightFlush(deck))
            {
                System.out.println("Straight Flush. (+50 Tokens)");
                tokens += 50;
            }
            else if (p1.straight(deck))
            {
                System.out.println("Straight. (+4 Tokens)");
                tokens += 4;
            }
            else if (p1.flush(deck))
            {
                System.out.println("Flush. (+5 Tokens)");
                tokens += 5;
            }
            else if (p1.fullHouse(deck))
            {
                System.out.println("Full House. (+6 Tokens)");
                tokens += 6;
            }
            else if (p1.fourKind(deck))
            {
                System.out.println("Four of a Kind. (+25 Tokens)");
                tokens += 25;
            }
            else if (p1.threeKind(deck))
            {
                System.out.println("Three of a Kind. (+3 Tokens)");
                tokens += 3;
            }
            else if (p1.onePair(deck))
            {
                System.out.println("One Pair. (+1 Token)");
                tokens += 1;
            }
        }
        else 
        {
            System.out.println("No Pair.");
        }

        if (tokens > 0)
        {
            System.out.println();
            System.out.print("You have " + tokens + " token(s). Would you like to play again? (0 = no, 1 = yes): ");
            end = scan.nextInt();
            
            while (tokens > 0 && end != 0)
            {
                if (end != 0)
                {
                    tokens--;
                }

                for (int i = 0; i < rejects.length - 1; i++)
                {
                    rejects[i] = 0;
                }
                rejectCard = -1;
                rCount = 0;
                cCount = 0;

                //Card Shuffling
                for (int i = 0; i < cards.size(); i++)
                {
                    int rCard = random.nextInt(51);
                    Collections.swap(cards, i, rCard);
                }

                deck.set(0, cards.get(0));
                deck.set(1, cards.get(1));
                deck.set(2, cards.get(2));
                deck.set(3, cards.get(3));
                deck.set(4, cards.get(4));

                //Starting Deck
                System.out.println();
                for (int i = 0; i < deck.size(); i++)
                {
                    System.out.println(deck.get(i).getCard());
                }
                System.out.println();

                //Reject Cards
                System.out.print("Would you like to reject any cards? (0 = no, 1 = yes): ");
                rejectNum = scan.nextInt();
                if (rejectNum == 1)
                {
                    while (rejectCard != 0 && rCount != 5)
                    {
                        System.out.print("Which card would you like to reject? (0 to stop): ");
                        rejectCard = scan.nextInt();

                        if (rejectCard != 0)
                        {
                            if (rejectCard == rejects[0] || rejectCard == rejects[1] || rejectCard == rejects[2] || rejectCard == rejects[3] || rejectCard == rejects[4])
                            {
                                while (rejectCard == rejects[0] || rejectCard == rejects[1] || rejectCard == rejects[2] || rejectCard == rejects[3] || rejectCard == rejects[4])
                                {
                                    System.out.print("This card has already been rejected. Try again: ");
                                    rejectCard = scan.nextInt();
                                }
                            }

                            deck.set(rejectCard - 1, cards.get(cCount + 5));
                            cCount++;
                            rejects[rCount] = rejectCard;
                            rCount++;

                            System.out.println();
                            for (Card i : deck)
                            {
                                System.out.println(i.getCard());
                            }
                            System.out.println();
                        }
                    }
                }

                //Card Points
                System.out.println();
                if (p1.checkAny(deck))
                {
                    System.out.println("Rewards: ");

                    if (p1.royalFlush(deck))
                    {
                        System.out.println("Royal Flush. (+250 Tokens)");
                        tokens += 250;
                    }
                    else if (p1.straightFlush(deck))
                    {
                        System.out.println("Straight Flush. (+50 Tokens)");
                        tokens += 50;
                    }
                    else if (p1.straight(deck))
                    {
                        System.out.println("Straight. (+4 Tokens)");
                        tokens += 4;
                    }
                    else if (p1.flush(deck))
                    {
                        System.out.println("Flush. (+5 Tokens)");
                        tokens += 5;
                    }
                    else if (p1.fullHouse(deck))
                    {
                        System.out.println("Full House. (+6 Tokens)");
                        tokens += 6;
                    }
                    else if (p1.fourKind(deck))
                    {
                        System.out.println("Four of a Kind. (+25 Tokens)");
                        tokens += 25;
                    }
                    else if (p1.threeKind(deck))
                    {
                        System.out.println("Three of a Kind. (+3 Tokens)");
                        tokens += 3;
                    }
                    else if (p1.onePair(deck))
                    {
                        System.out.println("One Pair. (+1 Token)");
                        tokens += 1;
                    }
                }
                else 
                {
                    System.out.println("No Pair.");
                }

                if (tokens > 0)
                {
                    System.out.print("You have " + tokens + " tokens. Would you like to play again? (0 = no, 1 = yes): ");
                    end = scan.nextInt();
                }
            }
        }
    }
}