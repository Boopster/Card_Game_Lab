import com.sun.codemodel.internal.JForEach;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
    }

    public ArrayList<Player> getPlayers() {

        return this.players;
    }

    public void addPlayer(Player player) {

        this.players.add(player);
    }

    public int countPlayers() {

        return this.players.size();
    }

    public void addCardToHand() {
        deck.populateDeck();
        deck.shuffleDeck();
        Card card = deck.dealCard();
        for (Player player: players) {
            player.setPlayerHand(card);
        }
    }

}
