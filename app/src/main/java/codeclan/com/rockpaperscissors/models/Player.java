package codeclan.com.rockpaperscissors.models;

/**
 * Created by user on 15/11/2017.
 */

public class Player {

    private HandMove handMove;

    public Player() {

    }

    public Player(HandMove handMove) {
        this.handMove = handMove;
    }

    public HandMove getHandMove() {
        return handMove;
    }

    public void setHandMove(HandMove newHandMove) {
        this.handMove = newHandMove;
    }
}
