package com.example.android.inventar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;

import static android.content.Intent.EXTRA_TEXT;

public class InspectActivity extends AppCompatActivity {

    ImageView mInspectImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspect);
        Intent inspectIntent = getIntent();
        Bundle bundle = inspectIntent.getExtras();
        Uri imagePath = (Uri) bundle.get("uri");
        loadImageFromCache(imagePath);
    }

    public void loadImageFromCache(Uri imagePath){
        mInspectImageView = (ImageView) findViewById(R.id.inspectImageView);
        mInspectImageView.setImageURI(imagePath);
    }
}
