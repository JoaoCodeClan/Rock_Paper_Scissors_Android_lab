package codeclan.com.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import codeclan.com.rockpaperscissors.R;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void onButtonClicked(View button) {

        Intent intent= new Intent(this, MainActivity.class) ;
        startActivity(intent);
    }

}
