package com.dell.apih9.unpocodeidiomas.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dell.apih9.unpocodeidiomas.R;
import com.dell.apih9.unpocodeidiomas.Tab.TabbedActivity;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressActivity extends AppCompatActivity {
    private TextView textViewName;
    private static final long SPLASH_TIME=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        textViewName = (TextView) findViewById(R.id.textCorreo);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Bienvenido " + nameFromIntent);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
               Intent TabbedIntent=new Intent().setClass(ProgressActivity.this, TabbedActivity.class);
                startActivity(TabbedIntent);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,SPLASH_TIME);


    }
}
