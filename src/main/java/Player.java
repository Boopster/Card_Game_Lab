import java.util.ArrayList;
import java.util.Iterator;

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

    public String showCard(int index){

        return this.playerHand.get(index).cardName();
    }

    public String getCardsPlayerHand() {
        String output = null;
            Card card1 = playerHand.get(0);
            Card card2 = playerHand.get(1);
            return output = String.format("%s's hand - %s %s : %s %s", this.getName(),card1.getRank(), card1.getSuit(), card2.getRank(), card2.getSuit());

//        for (Card card : playerHand) {
//            card.getRank();
//            card.getSuit();
//        }
    }

//    for(String fruit : fruitBasket) {
//        System.out.println(fruit);
//    }

    public String getCardsDealerHand() {
        String output = null;
        Card card1 = playerHand.get(0);
        Card card2 = playerHand.get(1);
        return output = String.format("The dealer's hand - %s %s : ??????", card1.getRank(), card1.getSuit());
    }

}

