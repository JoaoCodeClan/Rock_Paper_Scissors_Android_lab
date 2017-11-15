package codeclan.com.rockpaperscissors.models;

import java.util.HashMap;

/**
 * Created by user on 15/11/2017.
 */

public class Game {

   private Player computer;
   private Player player;
   private HashMap<HandMove, HandMove> outputs;

   public Game(Player computer, Player player) {
       this.computer = computer;
       this.player = player;
       this.outputs = new HashMap();
       outputs.put(HandMove.ROCK,HandMove.SCISSORS);
       outputs.put(HandMove.PAPER,HandMove.ROCK);
       outputs.put(HandMove.SCISSORS,HandMove.PAPER);

   }

    public String getWinner() {
      String result= "The winner is :";
       if(outputs.get(player.getHandMove()).equals(computer.getHandMove())){
           result = result + " Player";
       }
        else if (player.getHandMove().equals(computer.getHandMove())){
       result = "It's a tie";
       }
        else{
            result = result + " Computer";
       }
        return result;
    }

}
