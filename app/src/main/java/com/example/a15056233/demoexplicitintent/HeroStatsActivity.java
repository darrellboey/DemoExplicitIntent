package com.example.a15056233.demoexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HeroStatsActivity extends AppCompatActivity {

    TextView tvName, tvStrength, tvTechnicalProwess;
    Button btnLike, btnDislike;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_stats);

        // get the intent
        Intent i = getIntent();

        //get the hero object first activity put in Intent
        Hero hero = (Hero) i.getSerializableExtra("hero");

        tvName = (TextView) findViewById(R.id.textViewName);
        tvStrength = (TextView) findViewById(R.id.textViewStrength);
        tvTechnicalProwess = (TextView) findViewById(R.id.textViewTechnicalProwess);

        // Use getters of hero object to get the attributes
        tvName.setText(hero.getName());
        tvStrength.setText("Strength :" + hero.getStrength());
        tvTechnicalProwess.setText("Technical :" + hero.getTechnicalProwess());
    }
}
