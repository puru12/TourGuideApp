package com.example.android.thekanpurguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AllenForrestZooActivity extends AppCompatActivity {

    String phone, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_allen_forrest_zoo);

        TextView phonetext = (TextView) findViewById(R.id.zoo_phonecall);
        phone = (phonetext.getText()).toString();

        ((LinearLayout) findViewById(R.id.zoophonecall)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
                if (intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
            }
        });

        TextView locationtext = (TextView) findViewById(R.id.zoo_location);
        location = (locationtext.getText()).toString();

        ((LinearLayout) findViewById(R.id.zoolocation)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=" + location + ",+Uttar Pradesh+India"));
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
            }
        });

    }
}
