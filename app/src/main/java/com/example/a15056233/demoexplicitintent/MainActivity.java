package com.example.a15056233.demoexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSuperman , tvBatman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSuperman = (TextView) findViewById(R.id.textViewSuperman);
        tvBatman = (TextView) findViewById(R.id.textViewBatman);

        // set listener to handle the clicking of superman Textview
        tvSuperman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create Hero object of strength 100 and technical 60
                Hero superman = new Hero("Superman", 100 , 60);
                Intent i =new Intent(MainActivity.this,HeroStatsActivity.class);

                // put hero object in intent
                i.putExtra("hero", superman);
                startActivity(i);

            }});

        // set listener to handle the clicking of batman textview

        tvBatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create Hero object of strength 60 and technical 90
                Hero batman = new Hero("Batman", 60 , 90);
                Intent i =new Intent(MainActivity.this,HeroStatsActivity.class);

                // put hero object in intent
                i.putExtra("hero", batman);
                startActivity(i);

            }});
    }
}
