package com.example.android.thekanpurguide;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;

public class FoodActivity extends AppCompatActivity {


    public static int restaurantIds[];

    public static void setRestaurantImageIds() {
        restaurantIds = new int[11];
        restaurantIds[0] = R.id.mcdonalds;
        restaurantIds[1] = R.id.kfc;
        restaurantIds[2] = R.id.subway;
        restaurantIds[3] = R.id.barbequenation;
        restaurantIds[4] = R.id.dominoespizza;
        restaurantIds[5] = R.id.chungfa;
        restaurantIds[6] = R.id.bababiryani;
        restaurantIds[7] = R.id.thelittlechef;
        restaurantIds[8] = R.id.cawnpore1857;
        restaurantIds[9] = R.id.waterside;
        restaurantIds[10] = R.id.terrazza;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_food);


        CardView cardBreakfast = (CardView)findViewById(R.id.breakfast);
        cardBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });

        CardView cardLunch = (CardView)findViewById(R.id.lunch);
        cardLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this, LunchActivity.class);
                startActivity(intent);
            }
        });

        CardView cardDinner = (CardView)findViewById(R.id.dinner);
        cardDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}
