import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;
    private int player1Total;
    private int player2Total;

    public Game(int player1Total, int player2Total) {
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
        this.player1Total = 0;
        this.player2Total = 0;

    }

    public int getPlayer1Total() {
        return this.player1Total;
    }

    public void setPlayer1Total() {
        this.player1Total += 1;
    }

    public int getPlayer2Total() {
        return this.player2Total;
    }

    public void setPlayer2Total() {
        this.player2Total += 1;
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
//        this.addCardToHand();
    }

    public void dealerTwist(Player player2) {
        int total2 = player2.getTotalPlayerHand();
        if (total2 <= 16) {
            this.playerTwist(player2);
        }
    }

    public String getResult(Player player1, Player player2) {
        int total1 = player1.getTotalPlayerHand();
        int total1a = player1.getOtherTotalPlayerHand();
        int total2 = player2.getTotalPlayerHand();
        if (total1a == 21) {
            this.setPlayer1Total();
            String output = String.format("%s is the winner!", player1.getName());
            return output;
        } else if (total1 <= 21 && total1 > total2 || total2 > 21) {
            this.setPlayer1Total();
            String output = String.format("%s is the winner!", player1.getName());
            return output;
        } else if (total1 == total2) {
            this.setPlayer2Total();
                return "It's a draw!";
            } else {
                return "The Dealer is the winner!";
            }
        }
    }

