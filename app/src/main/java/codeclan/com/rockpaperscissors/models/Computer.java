package codeclan.com.rockpaperscissors.models;


import android.util.Log;

import java.util.Random;

/**
 * Created by user on 15/11/2017.
 */

public class Computer extends Player {


     public Computer(){
         super();

         HandMove[] moves = HandMove.values();
         Random random = new Random();

         int randomNumber = random.nextInt(moves.length);
         HandMove computerMove = moves[randomNumber];

         this.setHandMove(computerMove);
     }


//    public int countMoves() {
//         return this.moves.length;
//    }
}
