package codeclan.com.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import codeclan.com.rockpaperscissors.R;
import codeclan.com.rockpaperscissors.models.Game;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Intent intent = getIntent();

        Bundle extras = intent.getExtras();



        String result = extras.getString("result");

        TextView resultTextView= findViewById(R.id.winnerresult);

       resultTextView.setText(result);

       String computerMove = extras.getString("computerMove");

        TextView computerResultTextView= findViewById(R.id.computermove);


        computerResultTextView.setText(computerMove);
    }



}
