import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {

        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {

        return this.cards;
    }

    public int countCards() {

        return this.cards.size();
    }

    public void populateDeck() {
        for (RankType rank : RankType.values()) {
            for (SuitType suit : SuitType.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
        int rnd = new Random().nextInt(this.cards.size());
        this.cards.remove(rnd);
        return this.cards.get(rnd);
    }

}


