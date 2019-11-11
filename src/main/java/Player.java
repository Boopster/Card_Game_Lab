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

//    reverse values in enums for method below to work

//    public int getTotalPlayerHand() {
//        int total = 0;
//        for (Card card : this.player) {
//            if ((card.getValueFromEnum() == 11 && (total > 21) {
//                total += 1;
//            } else {
//                total += card.getValueFromEnum()
//            }
//            return total;
//        }
//    }

    public int getOtherTotalPlayerHand() {
        int i = 0;
        for (Card card:playerHand) {
            i += card.getOtherValueFromEnum();
        }
        return i;
    }

    public String getStringPlayerHand() {
        int i = 0;
        String output = null;
        for(Card card:playerHand) {
            i += card.getValueFromEnum();
        }
        if (i > 21) {
            output = String.format("%s: BUST!!!!", i);
        } else {
            output = String.format(String.valueOf(i));
        } return output;
    }

    public String showCard(int index){

        return this.playerHand.get(index).cardName();

    }

}

