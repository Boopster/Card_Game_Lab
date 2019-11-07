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
//        Card card = deck.dealCard();
        for (Player player: players) {
            Card card = deck.dealCard();
            player.setPlayerHand(card);
        }
    }

    public String getResult(Player player1, Player player2) {
        if (player1.getPlayerHand().getValueFromEnum() > player2.getPlayerHand().getValueFromEnum()) {
            String output = String.format("%s is the winner!", player1.getName());
            return output;
        } else if (player1.getPlayerHand().getValueFromEnum() == player2.getPlayerHand().getValueFromEnum()) {
                return "It's a draw!";
            } else {
                return "The dealer is the winner!";
            }
        }
    }

