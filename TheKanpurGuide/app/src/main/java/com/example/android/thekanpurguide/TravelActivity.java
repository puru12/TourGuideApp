package com.example.android.thekanpurguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ((CardView)findViewById(R.id.bithoor)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this, BithoorActivity.class);
                startActivity(intent);
            }
        });


        ((CardView)findViewById(R.id.allen_forest_zoo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this, AllenForrestZooActivity.class);
                startActivity(intent);
            }
        });


        ((CardView)findViewById(R.id.iscon_temple)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this, IsconTempleActivity.class);
                startActivity(intent);
            }
        });

        ((CardView)findViewById(R.id.blue_world)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this, BlueWorldActivity.class);
                startActivity(intent);
            }
        });
    }
}