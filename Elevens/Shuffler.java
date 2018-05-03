/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     * int next = 2 * (i+1);
    if(next > values.length){
    next = 0;
    }
    int temp = values[i];
    values[i] = values[next];
    values[next] = temp;
     */
    private static final int SHUFFLE_COUNT = 1;
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
            " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
            " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void test(){
        System.out.println(1%2);
    }

    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     * 
     */
    public static void perfectShuffle(int[] values) {
        int[] cards1 = new int[values.length/2];
        int[] cards2 = new int [values.length/2];
        int[] newValues = new int[values.length];
        for(int i = 0; i < (values.length-1)/2; i++) // first half of array stored
        {
            cards1[i] = values[i];
        }
        for(int j = values.length-1; j > (values.length)/2; j--) // second half of array stored
        {
            int id = 0;
            cards2[id] = values[j];
            id++;
        }
        for(int x = 0; x < cards1.length-1; x++)
        {
            
            newValues[x + (2%(x + 1))] = values[x];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] array) {
        int[] shuffled = new int[52];
        
    }
}






