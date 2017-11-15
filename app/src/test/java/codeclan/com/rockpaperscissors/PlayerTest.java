package codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.rockpaperscissors.models.HandMove;
import codeclan.com.rockpaperscissors.models.Player;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player(HandMove.ROCK);
    }

    @Test
    public void canGetHandMove(){
        assertEquals(HandMove.ROCK, player.getHandMove());
    }

    @Test
    public void canSetHandMove(){
        player.setHandMove(HandMove.PAPER);
        HandMove actual= player.getHandMove();
        assertEquals(HandMove.PAPER, actual);

    }



}
