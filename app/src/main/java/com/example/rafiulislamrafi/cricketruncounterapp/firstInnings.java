package com.example.rafiulislamrafi.cricketruncounterapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class firstInnings extends Activity {

    int target, run = 0;
    double ball = 0.0;
    double over = 0.0;
    int wicket = 0;

    Button button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
    TextView textView, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_innings);

        objectCast();
        runCountbutontClick();
        ballCountButtonClick();
        countWicketButtonClick();
    }

    public void objectCast() {


        textView = (TextView) findViewById(R.id.targetText);
        textView2 = (TextView) findViewById(R.id.currentRun);
        textView3 = (TextView) findViewById(R.id.overText);
        textView4 = (TextView) findViewById(R.id.wicketText);

        button2 = (Button) findViewById(R.id.runCounterPlusOne);
        button3 = (Button) findViewById(R.id.runCounterPlusfore);
        button4 = (Button) findViewById(R.id.runCounterPlussix);
        button5 = (Button) findViewById(R.id.runCounterMinusOne);
        button6 = (Button) findViewById(R.id.runCounterMinusfore);
        button7 = (Button) findViewById(R.id.runCounterMinusSix);

        button8 = (Button) findViewById(R.id.ballCounterPlusOne);
        button9 = (Button) findViewById(R.id.ballCounterMinusOne);

        button10 = (Button) findViewById(R.id.wicketCounterPlusOne);
        button11 = (Button) findViewById(R.id.wicketCounterMinusOne);

    }

    public void runCountbutontClick() {


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                run++;
                textView2.setText("Run : " + run);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                run = run + 4;
                textView2.setText("Run : " + run);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                run = run + 6;
                textView2.setText("Run : " + run);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (run > 0) {
                    run--;
                    textView2.setText("Run : " + run);
                } else {
                    Toast.makeText(getApplicationContext(), "You Are Going To Wrong Direction", Toast.LENGTH_LONG).show();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (run > 3) {
                    run = run - 4;
                    textView2.setText("Run : " + run);
                } else {
                    Toast.makeText(getApplicationContext(), "You Are Going To Wrong Direction", Toast.LENGTH_LONG).show();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (run > 5) {
                    run = run - 6;
                    textView2.setText("Run : " + run);
                } else {
                    Toast.makeText(getApplicationContext(), "You Are Going To Wrong Direction", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void ballCountButtonClick() {

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ball = ball + .1;
                textView3.setText("Over : " + (over + ball));

                if (ball == .6) {

                    over = over + 1.0;
                    textView3.setText("Over : " + over);
                    ball = .0;
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((over + ball) >= .1) {
                    ball = ball - .1;

                    if ((ball < .0) || (ball == .9)) {
                        over = over - 1;
                        ball = .5;
                    }
                    textView3.setText("Over : " + (over + ball));
                } else {
                    Toast.makeText(getApplicationContext(), "You Are Going To Wrong Direction", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void countWicketButtonClick() {

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (wicket < 10)
                    wicket++;
                textView4.setText("Wicket : " + wicket);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wicket > 0) {
                    wicket--;
                    textView4.setText("Wicket : " + wicket);
                }
            }
        });
    }
}

