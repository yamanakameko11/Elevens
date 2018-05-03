
/**
 * Write a description of class DeckTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeckTester
{
    public static void main(String[] args) {
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"SPADES", "DIAMONDS", "HEARTS", "CLUBS"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Deck deck = new Deck(ranks, suits, values);
        System.out.println(deck);
        System.out.println(perfectShuffle(deck));
    }
}