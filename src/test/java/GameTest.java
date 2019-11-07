import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Game game;
    Player player;
    Player dealer;
    ArrayList<Player> players;

    @Before
    public void before() {
        game = new Game();
        player = new Player("Becky");
        dealer = new Player("Lily-Rose");
    }

    @Test
    public void canAddPlayersToGame() {
        game.addPlayer(player);
        game.addPlayer(dealer);
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void canDealCardToPlayer() {
        game.addPlayer(player);
        game.addPlayer(dealer);
        game.addCardToHand();
        assertNotNull(player.getPlayerHand());
        assertNotNull(dealer.getPlayerHand());
    }


}
