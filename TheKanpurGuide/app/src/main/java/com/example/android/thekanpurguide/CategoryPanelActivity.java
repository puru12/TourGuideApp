package com.example.android.thekanpurguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
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

                    case 5:
                        intent = new Intent(CategoryPanelActivity.this, HistoryActivity.class);
                        startActivity(intent);

                }
            }
        });

        ArrayList<String> spinnerList = new ArrayList<>();
        spinnerList.add("About the dev");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setSelection(0);

        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapterSpinner);

        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    Intent intent = new Intent(CategoryPanelActivity.this, DeveloperActivity.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };

        spinner.setOnItemSelectedListener(onItemSelectedListener);
    }
}
