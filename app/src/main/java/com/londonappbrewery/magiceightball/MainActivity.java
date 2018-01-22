package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button madButton, oldButton, hideButton;
        madButton = (Button) findViewById(R.id.madButton);
        oldButton = (Button) findViewById(R.id.oldButton);
        hideButton = (Button) findViewById(R.id.hideButton);

        final ImageView magicBall;
        magicBall = (ImageView) findViewById(R.id.image_ball);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        final Random randomNumber = new Random();

        madButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magicBall.setVisibility(View.VISIBLE);

                magicBall.setImageResource(ballArray[randomNumber.nextInt(5)]);
            }
        });
        oldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magicBall.setVisibility(View.VISIBLE);

                magicBall.setImageResource(ballArray[randomNumber.nextInt(5)]);
            }
        });
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magicBall.setVisibility(View.INVISIBLE);
            }
        });
    }
}
