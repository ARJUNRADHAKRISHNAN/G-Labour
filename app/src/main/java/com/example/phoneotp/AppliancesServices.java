package com.example.phoneotp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class AppliancesServices extends AppCompatActivity {

    ListView applv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliances_services);

        applv = (ListView)findViewById(R.id.appliance);
        final String values[] = {"AC Service and Repair","Refrigerator Service and Repair","Washing Machine service and Repair","Television Repair and Installation","Computer Service and Repair","Oven",};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));

        applv.setAdapter(arrayAdapter);

        applv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(AppliancesServices.this,"U Clicked:" + values[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}
