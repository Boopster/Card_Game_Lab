import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerHand;
    private String name;

    public Player(String name) {
        this.playerHand = new ArrayList<Card>();
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int countNoCardsPlayerHand() {
        return this.playerHand.size();
    }

    public void addCardToPlayerHand(Card card) {
        this.playerHand.add(card);
    }

    public int getTotalPlayerHand() {
        int i = 0;
        for(Card card:playerHand) {
            i += card.getValueFromEnum();
        }
        return i;
    }

}

