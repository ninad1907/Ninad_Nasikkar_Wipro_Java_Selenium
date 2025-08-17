/*Card Suit & Rank
Redesign a Card class using two enums: Suit (CLUBS, DIAMONDS, HEARTS, SPADES) and Rank (ACE…KING).
Then implement a Deck class to:
•	Create all 52 cards.
•	Shuffle and print the order.


*/
package enums;

import java.util.*;

enum Suit
{
    CLUBS, DIAMONDS, HEARTS, SPADES
}

enum Rank
{
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
    EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card
{
    Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString()
    {
        return rank + " of " + suit;
    }
}

class Deck
{
    List<Card> cards = new ArrayList<>();

    Deck()
    {
        for (Suit s : Suit.values())
        {
            for (Rank r : Rank.values())
            {
                cards.add(new Card(s, r));
            }
        }
    }

    void shuffle()
    {
        Collections.shuffle(cards);
    }

    void printDeck()
    {
        for (Card c : cards)
        {
            System.out.println(c);
        }
    }
}

public class Q3
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        deck.shuffle();
        deck.printDeck();
    }
}

