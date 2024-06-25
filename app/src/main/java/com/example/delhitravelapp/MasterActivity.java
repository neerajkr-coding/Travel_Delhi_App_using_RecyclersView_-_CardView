package com.example.delhitravelapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MasterActivity extends AppCompatActivity {

    ImageView im;

    TextView titleMaster,t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        im = findViewById(R.id.imageMaster);

        titleMaster = findViewById(R.id.TitleMaster);
        t1 = findViewById(R.id.locationText);
        t2 = findViewById(R.id.metroStationText);
        t3 = findViewById(R.id.timingText);
        t4 = findViewById(R.id.entryFeeText);

        Intent i = getIntent();

        int image = i.getIntExtra("image",0);

        String title = i.getStringExtra("title");
        String str1 = i.getStringExtra("loc");
        String str2 = i.getStringExtra("metro");
        String str3 = i.getStringExtra("time");
        String str4 = i.getStringExtra("fee");



        im.setImageResource(image);

        titleMaster.setText(title);
        t1.setText(str1);
        t2.setText(str2);
        t3.setText(str3);
        t4.setText(str4);



    }
}