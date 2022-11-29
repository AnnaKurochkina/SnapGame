package snap;

import java.util.Comparator;

public class CardValueComparer implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getValue() == card2.getValue()) {
            return 0;
        } else if (card1.getValue() > card2.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}

