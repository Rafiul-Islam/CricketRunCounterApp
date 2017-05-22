package com.example.rafiulislamrafi.cricketruncounterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCast();
        ButtonClick();
    }

    public void objCast() {

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
    }

    public void ButtonClick() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, firstInnings.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondInnings.class);
                startActivity(intent);
            }
        });
    }
}
