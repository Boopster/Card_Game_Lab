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
    }

    @Test
    public void canAddPlayersToGame() {
//        game.addPlayer(player1);
//        game.addPlayer(player2);
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void canDealCardToPlayer() {
//        game.addPlayer(player1);
//        game.addPlayer(player2);
//        game.addCardToHand();
        assertNotNull(player1.getPlayerHand());
        assertNotNull(player2.getPlayerHand());
    }

    @Test
    public void canDeclareResult() {
//        game.addPlayer(player1);
//        game.addPlayer(player2);
//        game.addCardToHand();
        System.out.println("Player 1 Hand: " + player1.getPlayerHand().getValueFromEnum());
        System.out.println("Player 2 Hand: " + player2.getPlayerHand().getValueFromEnum());
        System.out.println(game.getResult(player1, player2));
    }


}
