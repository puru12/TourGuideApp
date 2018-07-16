package com.example.android.thekanpurguide;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ImageAssistantActivity extends AppCompatActivity {

    public void setImagetoView(View v){

        ImageView imageView = (ImageView)v;
        ImageActivity.imageDrawable = imageView.getDrawable();

        /*This code snippet first converts a drawable to a bitmap object(first line) and then converts the
        bitmap object to a byte stream which is further converted into a byte array */

        /*Bitmap bitmap = ((BitmapDrawable)imageResource).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] b = byteArrayOutputStream.toByteArray();*/


        Intent intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }
}
