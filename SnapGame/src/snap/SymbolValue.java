package snap;

import java.util.Map;

import static java.util.Map.entry;

public class SymbolValue {

    public static Map<Symbol, String> map = Map.ofEntries(
        entry(Symbol.TWO, "2"),
        entry(Symbol.THREE, "3"),
        entry(Symbol.FOUR, "4"),
        entry(Symbol.FIVE, "5"),
        entry(Symbol.SIX, "6"),
        entry(Symbol.SEVEN, "7"),
        entry(Symbol.EIGHT, "8"),
        entry(Symbol.NINE, "9"),
        entry(Symbol.TEN, "10"),
        entry(Symbol.JACK, "J"),
        entry(Symbol.QUEEN, "Q"),
        entry(Symbol.KING, "K"),
        entry(Symbol.ACE, "A")
    );
}
