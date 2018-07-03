package com.example.android.thekanpurguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.alternate_main);

        RelativeLayout button = (RelativeLayout) findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CategoryPanelActivity.class);
                startActivity(intent);
            }
        });

        int launchers[] = new int[11];

        launchers[0] = R.drawable.launcher1;
        launchers[1] = R.drawable.launcher1;
        launchers[2] = R.drawable.launcher3;
        launchers[3] = R.drawable.launcher4;
        launchers[4] = R.drawable.launcher5;
        launchers[5] = R.drawable.launcher6;
        launchers[6] = R.drawable.launcher7;
        launchers[7] = R.drawable.launcher8;
        launchers[8] = R.drawable.launcher8;
        launchers[9] = R.drawable.launcher10;
        launchers[10] = R.drawable.launcher11;

        int random  = (int)(10.0*Math.random());
        //ImageView imageView = findViewById(R.id.launcher);
        //imageView.setImageResource(R.drawable.launcher);
    }
}
