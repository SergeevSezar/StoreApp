package com.example.danilamaster;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ScrewDriverDetailActivity extends AppCompatActivity {

    private ImageView imageViewScrewDriver;
    private TextView textViewTitleScrewDriver;
    private TextView textViewInfoCrewDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screw_driver_detail);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        imageViewScrewDriver = findViewById(R.id.imageViewScrewDriver);
        textViewTitleScrewDriver = findViewById(R.id.textViewTitleScrewDriver);
        textViewInfoCrewDriver = findViewById(R.id.textViewInfoScrewDriver);
        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("resId")) {
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int resId = intent.getIntExtra("resId", 1);
            imageViewScrewDriver.setImageResource(resId);
            textViewTitleScrewDriver.setText(title);
            textViewInfoCrewDriver.setText(info);
        } else {
            Intent backToScrewDriver = new Intent(this, ScrewdriverActivity.class);
            startActivity(backToScrewDriver);
        }
    }
}