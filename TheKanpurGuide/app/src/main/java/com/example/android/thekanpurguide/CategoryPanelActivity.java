package com.example.android.thekanpurguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CategoryPanelActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(CategoryPanelActivity.this, DeveloperActivity.class);
        startActivity(intent);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow_menu, menu);
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_category_panel);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.drawable.climatetemplate);
        list.add(R.drawable.foodanddrinkstemplate);
        list.add(R.drawable.traveltemplate);
        list.add(R.drawable.governancetemplate);
        list.add(R.drawable.transporttemplate);
        list.add(R.drawable.historytemplate);

        final ListView imlist = (ListView) findViewById(R.id.imagelist);
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, 0, list);
        imlist.setAdapter(adapter);

        imlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                switch (position) {

                    case 0:
                        intent = new Intent(CategoryPanelActivity.this, ClimateActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(CategoryPanelActivity.this, FoodActivity.class);
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(CategoryPanelActivity.this, TravelActivity.class);
                        startActivity(intent);
                        break;

                    case 3:
                        intent = new Intent(CategoryPanelActivity.this, GovernanceActivity.class);
                        startActivity(intent);
                        break;

                    case 4:
                        intent = new Intent(CategoryPanelActivity.this, TransportActivity.class);
                        startActivity(intent);
                        break;

                    case 5:
                        intent = new Intent(CategoryPanelActivity.this, HistoryActivity.class);
                        startActivity(intent);

                }
            }
        });
    }
}
