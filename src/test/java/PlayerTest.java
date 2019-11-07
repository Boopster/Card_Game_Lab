import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PlayerTest {

    Player player;
    Player dealer;

    @Before
    public void before() {
        player = new Player("Becky");
        dealer = new Player("Dealer");
    }

    @Test
    public void canGetHandWhenEmpty() {
        assertNull(player.getPlayerHand());
        assertNull(dealer.getPlayerHand());
    }

}
