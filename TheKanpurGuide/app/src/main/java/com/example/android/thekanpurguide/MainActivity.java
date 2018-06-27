package com.example.android.thekanpurguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.drawable.climatetemplate);
        list.add(R.drawable.foodanddrinkstemplate);
        list.add(R.drawable.traveltemplate1);
        list.add(R.drawable.governancetemplate);
        list.add(R.drawable.transporttemplate);
        list.add(R.drawable.historytemplate);

        ListView imlist = (ListView) findViewById(R.id.imagelist);
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, 0, list);
        imlist.setAdapter(adapter);
    }
}
