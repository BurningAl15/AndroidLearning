package com.example.aldhair.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton=(Button) findViewById(R.id.rollButton);

        //final keyword make the variable a constant

        final ImageView leftDice=(ImageView)findViewById(R.id.image_leftDice);

        final ImageView rightDice=(ImageView)findViewById(R.id.image_rightDice);

        final int[] diceArray={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,
                R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DiceApp","Button has been pressed");
                Random randomNumGenerator=new Random();
                int number=randomNumGenerator.nextInt(6);
                int number2=randomNumGenerator.nextInt(6);
                Log.d("DiceApp","The random number is: "+number);
                leftDice.setImageResource(diceArray[number]);

                rightDice.setImageResource(diceArray[number2]);
                if(number+number2==10)
                {
                     Log.d("DiceApp","You fucking win man");
                }
            }
        });

    }
}
