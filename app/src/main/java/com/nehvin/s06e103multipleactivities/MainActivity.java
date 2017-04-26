package com.nehvin.s06e103multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    Intent intent=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        intent = new Intent(getApplicationContext(),SecondActivity.class);

        final List<String> friendsList = new ArrayList<String>(asList("Manish","Dilip","Premal San",
                "Vijay","Vikram","Adwait"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, friendsList);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                intent.putExtra("friendName", friendsList.get(i).toString());
                startActivity(intent);
            }
        });

    }

    public void secondActivity(View view)
    {
//        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
//        startActivity(intent);
    }

}
