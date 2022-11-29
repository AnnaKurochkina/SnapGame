package snap;

public class Card {

    Suit suit;
    Symbol symbol;

    public Card(Suit suit, Symbol symbol) {
        this.suit = suit;
        this.symbol = symbol;
    }

    public String toString() {
        return String.format("%-2s", SymbolValue.map.get(this.symbol)) + SuitUnicode.map.get(this.suit);
    }

    public Suit getSuit() {
        return suit;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public int getValue() {
        return this.symbol.getValue();
    }
}
