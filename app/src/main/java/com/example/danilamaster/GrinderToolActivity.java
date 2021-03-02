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

public class GrinderToolActivity extends AppCompatActivity {

    private ListView listViewGingerTools;
    private ArrayList<GingerTool> gingerTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grinder_tool);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        listViewGingerTools = findViewById(R.id.listViewGingerTools);
        gingerTools = new ArrayList<>();
        ArrayAdapter<GingerTool> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, gingerTools);
        listViewGingerTools.setAdapter(adapter);
        gingerTools.add(new GingerTool(getString(R.string.ginger_interskol_title), getString(R.string.ginger_interskol_info), R.drawable.gingerinterskol));
        gingerTools.add(new GingerTool(getString(R.string.ginger_makita_title), getString(R.string.ginger_makita_info), R.drawable.gingermakita));
        gingerTools.add(new GingerTool(getString(R.string.ginger_dewalt_title), getString(R.string.ginger_dewalt_info), R.drawable.gingerdewalt));
        listViewGingerTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), GingerDetailActivity.class);
                GingerTool gingerTool = gingerTools.get(position);
                intent.putExtra("title", gingerTool.getTitle());
                intent.putExtra("info", gingerTool.getInfo());
                intent.putExtra("resId", gingerTool.getImgResId());
                startActivity(intent);
            }
        });
    }
}