package snap;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    String name;
    ArrayList<Card> deckOfCards = new ArrayList<>();

    public CardGame(String name) {
        this.name = name;
        for(Suit suit : Suit.values()) {
            for(Symbol symbol : Symbol.values()) {
                deckOfCards.add(new Card(suit, symbol));
            }
        }
        shuffleDeck();
    }

    public ArrayList<Card> getDeck() {
        return this.deckOfCards;
    }

    Card dealCard() {
        var card = this.deckOfCards.get(0);
        this.deckOfCards.remove(card);
        return card;
    }

    ArrayList<Card> sortDeckInNumberOrder() {

        return null;
    }

    ArrayList<Card> sortDeckIntoSuits() {

        return null;
    }

    void shuffleDeck() {
        Collections.shuffle(this.deckOfCards);
    }

}

