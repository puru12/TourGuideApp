package com.example.android.thekanpurguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class BreakfastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_breakfast);

        FoodActivity.setRestaurantImageIds();

        for(int i = 0;i < 4;i ++){
            final int restaurant = i;
            CardView cardView = findViewById(FoodActivity.restaurantIds[i]);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RestaurantActivity.setRestaurantToDisplay(restaurant);
                    Intent intent = new Intent(BreakfastActivity.this, RestaurantActivity.class);
                    startActivity(intent);
                }
            });
        }

    }
}
