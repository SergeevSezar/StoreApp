package com.example.danilamaster;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        listViewTool = findViewById(R.id.listViewTool);
        listViewTool.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), DrillActivity.class);
                    startActivity(intent);
                    break;
                }
                switch (position) {
                    case 1:
                        Intent intent = new Intent(getApplicationContext(), ScrewdriverActivity.class);
                        startActivity(intent);
                        break;
                }
                switch (position) {
                    case 2:
                        Intent intent = new Intent(getApplicationContext(), GrinderToolActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}