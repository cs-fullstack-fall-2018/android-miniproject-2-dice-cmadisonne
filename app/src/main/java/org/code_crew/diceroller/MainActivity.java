package org.code_crew.diceroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView diceView;
    private Random roll = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceView = findViewById(R.id.diceView);
        diceView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                rollDice();
            }
        });
    }
    private void rollDice(){
        int randonNumber = roll.nextInt(6) + 1;

        switch (randonNumber){
            case 1:
                diceView.setImageResource(R.drawable.one);
                break;
            case 2:
                diceView.setImageResource(R.drawable.two);
                break;
            case 3:
                diceView.setImageResource(R.drawable.three);
                break;
            case 4:
                diceView.setImageResource(R.drawable.four);
                break;
            case 5:
                diceView.setImageResource(R.drawable.five);
                break;
            case 6:
                diceView.setImageResource(R.drawable.six);
                break;
        }
    }
}