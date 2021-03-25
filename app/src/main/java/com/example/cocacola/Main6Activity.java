package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Main6Activity extends AppCompatActivity {
    Timer time;
    //Button b1;
    // ProgressBar progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6starter);

        //progressBar2 =(ProgressBar)findViewById(R.id.progressBar3);
        //  b1 = (Button)findViewById(R.id.button);

        time = new Timer();

       // progressBar2.setVisibility(View.VISIBLE);
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent( Main6Activity.this,Main5Activity.class);
                startActivity(intent);

                finish();

            }
        },4000);
    }
}
