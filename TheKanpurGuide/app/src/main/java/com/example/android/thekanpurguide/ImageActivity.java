package com.example.android.thekanpurguide;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    static Drawable imageDrawable = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_image);

        ImageView imageView = (ImageView) findViewById(R.id.display_image);

        imageView.setImageDrawable(imageDrawable);

        /*Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //converting the byte stream to a bitmap object

            byte[] b= extras.getByteArray("image");
            Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
            imageView.setImageBitmap(bitmap);
        }*/
    }
}
