import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerHand;
    private String name;

    public Player(String name) {
        this.playerHand = new ArrayList<Card>();
        this.name = name;
    }

//    public Card getPlayerHand() {
//
//        return this.playerHand;
//    }
//
//    public void setPlayerHand(Card playerHand) {
//        this.playerHand = playerHand;
//    }

    public int countNoCardsPlayerHand() {
        return this.playerHand.size();
    }

    public void addCardToPlayerHand(Card card) {
        this.playerHand.add(card);
    }

    public String getName() {
        return name;
    }

}
