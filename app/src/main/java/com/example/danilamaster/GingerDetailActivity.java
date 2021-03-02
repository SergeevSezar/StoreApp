package com.example.danilamaster;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GingerDetailActivity extends AppCompatActivity {

    private ImageView imageViewGinger;
    private TextView textViewTitleGinger;
    private TextView textViewInfoGinger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ginger_detail);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        imageViewGinger = findViewById(R.id.imageViewGinger);
        textViewTitleGinger = findViewById(R.id.textViewTitleGinger);
        textViewInfoGinger = findViewById(R.id.textViewInfoGinger);
        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("resId")) {
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int resId = intent.getIntExtra("resId", 1);

            textViewTitleGinger.setText(title);
            textViewInfoGinger.setText(info);
            imageViewGinger.setImageResource(resId);
        } else {
            Intent backToGrinderToolActivity = new Intent(this, GrinderToolActivity.class);
            startActivity(backToGrinderToolActivity);
        }
    }
}