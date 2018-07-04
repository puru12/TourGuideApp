package com.example.android.thekanpurguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;

public class DinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dinner);

        for(int i = 8;i < 11;i ++){
            final int restaurant = i;
            CardView cardView = findViewById(FoodActivity.restaurantIds[i]);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RestaurantActivity.setRestaurantToDisplay(restaurant);
                    Intent intent = new Intent(DinnerActivity.this, RestaurantActivity.class);
                    startActivity(intent);
                }
            });
        }

    }
}
