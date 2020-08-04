import java.util.ArrayList;
import java.util.List;

public class CardDeckGenerator {
    static List<Card> generate() {
        List<Card> deck = new ArrayList<>();
        CardColor[] colors = CardColor.values();
        CardValue[] values = CardValue.values();
        for (CardColor color : colors) {
            for (CardValue value : values) {
                deck.add(new Card(color, value));
            }
        }
        return deck;
    }
}