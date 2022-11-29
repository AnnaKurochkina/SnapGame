package snap;

import java.util.Comparator;

public class CardSuitComparer implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getSuit() == card2.getSuit()) {
            return 0;
        } else if (SuitUnicode.map.get(card1.getSuit()) > SuitUnicode.map.get(card2.getSuit())) {
            return 1;
        } else {
            return -1;
        }
    }
}
