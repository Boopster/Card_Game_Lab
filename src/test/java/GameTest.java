import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    ArrayList<Player> players;

    @Before
    public void before() {
        game = new Game();
        player1 = new Player("Becky");
        player2 = new Player("Lily-Rose");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addCardToHand();
        game.addCardToHand();

    }

    @Test
    public void canAddPlayersToGame() {
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void canDealCardsToPlayer() {
        assertEquals(2, player1.countNoCardsPlayerHand());
        assertEquals(2, player2.countNoCardsPlayerHand());
    }

    @Test
    public void canGetTotalPlayerHand() {
        System.out.println(player1.getName() + "'s hand: " + player1.getFirstTotalPlayerHand());
        System.out.println("The Dealer's hand: " + player2.getFirstTotalPlayerHand());
    }

    @Test
    public void canTwist() {
        game.playerTwist(player1);
        assertEquals(3,player1.countNoCardsPlayerHand());
    }

//    @Test
//    public void canDeclareResult() {
//        System.out.println("Player 1 Hand: " + player1.getPlayerHand().getValueFromEnum());
//        System.out.println("Player 2 Hand: " + player2.getPlayerHand().getValueFromEnum());
//        System.out.println(game.getResult(player1, player2));
//    }


}
