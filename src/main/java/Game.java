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

        for (Player player: players) {
            Card card = deck.dealCard();
            player.addCardToPlayerHand(card);
        }
    }

    public void startGame(Player player1, Player player2) {
        deck.populateDeck();
        deck.shuffleDeck();
        this.addPlayer(player1);
        this.addPlayer(player2);
        this.addCardToHand();
        this.addCardToHand();
    }

    public void playerTwist(Player player) {
        Card card = deck.dealCard();
        player.addCardToPlayerHand(card);
    }

    public void dealerTwist(Player player2) {
        int total2 = player2.getTotalPlayerHand();
        if (total2 <= 16) {
            this.playerTwist(player2);
        }
    }

    public String getResult(Player player1, Player player2) {
        int total1 = player1.getTotalPlayerHand();
        int total2 = player2.getTotalPlayerHand();
        if (total1 <= 21 && total1 > total2 || total2 > 21) {
            String output = String.format("%s is the winner!", player1.getName());
            return output;
        } else if (total1 == total2) {
                return "It's a draw!";
            } else {
                return "The Dealer is the winner!";
            }
        }
    }

