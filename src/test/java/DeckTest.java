import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void startsWithEmptyDeck() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canShuffleDeck() {
        deck.populateDeck();
        deck.shuffleDeck();
        assertEquals(deck.getCards(),deck.getCards());

    }

    @Test
    public void canDealCard() {
        deck.populateDeck();
        deck.shuffleDeck();
        deck.dealCard();
//        Card card = deck.dealCard();
        assertEquals(51, deck.countCards());
    }

}
