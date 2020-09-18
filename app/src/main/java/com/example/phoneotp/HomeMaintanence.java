package com.example.phoneotp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class HomeMaintanence extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_maintanence);

    lv = (ListView)findViewById(R.id.progList);
    final String values[] = {"Carpenter","Plumber","Electrician","Painter","Masonry","Grass Cutting",};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));

    lv.setAdapter(arrayAdapter);

    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(HomeMaintanence.this,"U Clicked:" + values[position],Toast.LENGTH_SHORT).show();
        }
    });
    }



}
