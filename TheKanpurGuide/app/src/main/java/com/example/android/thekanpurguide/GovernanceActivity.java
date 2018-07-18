package com.example.android.thekanpurguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GovernanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_governance);
    }

    public void callEmergencyNumber1(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0512 230446"));
        startActivity(intent);
    }

    public void callEmergencyNumber2(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0512 2304407"));
        startActivity(intent);
    }

    public void callEmergencyNumber3(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0512 2309012"));
        startActivity(intent);
    }

    public void callEmergencyNumber4(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0512 2362222"));
        startActivity(intent);
    }

}
