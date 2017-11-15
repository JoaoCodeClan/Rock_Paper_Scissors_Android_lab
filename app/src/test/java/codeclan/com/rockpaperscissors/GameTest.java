package codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.rockpaperscissors.models.Computer;
import codeclan.com.rockpaperscissors.models.Game;
import codeclan.com.rockpaperscissors.models.HandMove;
import codeclan.com.rockpaperscissors.models.Player;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2017.
 */

public class GameTest {

    private Player player;
    private Player computer;
    private Player computer1;
    private Player computer2;
    private Game game;
    private Game game1;
    private Game game2;

    @Before
    public void Before() {
        this.player = new Player(HandMove.ROCK);
        this.computer = new Player(HandMove.PAPER);
        this.computer1 = new Player(HandMove.ROCK);
        this.computer2 = new Player(HandMove.SCISSORS);
        this.game = new Game(computer, player);
        this.game1 = new Game(computer1, player);
        this.game2 = new Game(computer2, player);
    }

    @Test
    public void computerWinsPlayer() {
        String actual = game.getWinner();
        assertEquals("The winner is : Computer", actual);
    }

    @Test
    public void resultIsATie() {
        String actual = game1.getWinner();
        assertEquals("It's a tie", actual);
    }

    @Test
    public void PlayerWinsComputer() {
        String actual = game2.getWinner();
        assertEquals("The winner is : Player", actual);
    }

}
