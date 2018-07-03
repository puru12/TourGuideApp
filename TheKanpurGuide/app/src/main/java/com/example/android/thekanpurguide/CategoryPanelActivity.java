package com.example.android.thekanpurguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CategoryPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_panel);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.drawable.climatetemplate);
        list.add(R.drawable.foodanddrinkstemplate);
        list.add(R.drawable.traveltemplate);
        list.add(R.drawable.governancetemplate);
        list.add(R.drawable.transporttemplate);
        list.add(R.drawable.historytemplate);

        ListView imlist = (ListView) findViewById(R.id.imagelist);
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, 0, list);
        imlist.setAdapter(adapter);

        imlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                switch (position){

                    case 0:
                        intent = new Intent(CategoryPanelActivity.this, ClimateActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(CategoryPanelActivity.this, FoodActivity.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }
}
