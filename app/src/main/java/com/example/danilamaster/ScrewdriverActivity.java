package com.example.danilamaster;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ScrewdriverActivity extends AppCompatActivity {

    private ListView listViewScrewDriver;
    private ArrayList<ScrewDriver> screwDrivers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screwdriver);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        listViewScrewDriver = findViewById(R.id.listViewScrewDriver);
        screwDrivers = new ArrayList<>();
        ArrayAdapter<ScrewDriver> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, screwDrivers);
        screwDrivers.add(new ScrewDriver(getString(R.string.screwdriver_interskol_title), getString(R.string.screwdriver_interskol_info), R.drawable.screwinterskol));
        screwDrivers.add(new ScrewDriver(getString(R.string.screwdriver_makita_title), getString(R.string.screwdriver_makita_info), R.drawable.screwdrivermakita));
        screwDrivers.add(new ScrewDriver(getString(R.string.screwdriver_dewalt_title), getString(R.string.screwdriver_dewalt_info), R.drawable.screwdewalt));
        listViewScrewDriver.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ScrewDriverDetailActivity.class);
                ScrewDriver screwDriver = screwDrivers.get(position);
                intent.putExtra("title", screwDriver.getTitle());
                intent.putExtra("info", screwDriver.getInfo());
                intent.putExtra("resId", screwDriver.getImgResId());
                startActivity(intent);
            }
        });
    }
}