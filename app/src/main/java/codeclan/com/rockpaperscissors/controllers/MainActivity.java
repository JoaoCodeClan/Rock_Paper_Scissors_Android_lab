package codeclan.com.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import codeclan.com.rockpaperscissors.R;
import codeclan.com.rockpaperscissors.models.Computer;
import codeclan.com.rockpaperscissors.models.Game;
import codeclan.com.rockpaperscissors.models.HandMove;
import codeclan.com.rockpaperscissors.models.Player;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPaperBtnClicked(View button) {

        Intent intent= new Intent(this, ResultActivity.class) ;
        Player player= new Player(HandMove.PAPER);

        Computer computer = new Computer();

        Game game = new Game(player,computer);

        String result = game.getWinner();
        intent.putExtra("result", result);

        String computerMove = computer.getHandMove().toString();
        intent.putExtra("computerMove", computerMove);



        startActivity(intent);
    }

    public void onRockBtnClicked(View button) {

        Intent intent= new Intent(this, ResultActivity.class) ;
        Player player= new Player(HandMove.ROCK);

        Computer computer = new Computer();

        Game game = new Game(player,computer);

        String result = game.getWinner();

        String computerMove = computer.getHandMove().toString();
        intent.putExtra("computerMove", computerMove);

        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onScissorsBtnClicked(View button) {

        Intent intent= new Intent(this, ResultActivity.class) ;
        Player player= new Player(HandMove.SCISSORS);

        Computer computer = new Computer();

        Game game = new Game(player,computer);

        String result = game.getWinner();
        intent.putExtra("result", result);


        String computerMove = computer.getHandMove().toString();
        intent.putExtra("computerMove", computerMove);

        startActivity(intent);
    }
}
