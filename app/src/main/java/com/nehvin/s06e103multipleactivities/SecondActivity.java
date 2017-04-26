package com.nehvin.s06e103multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intent = getIntent();
        Toast.makeText(this, "Hi "+intent.getStringExtra("friendName"), Toast.LENGTH_SHORT).show();

    }

    public void backToFirst (View view)
    {
        Intent intent1 = new Intent (getApplicationContext(), MainActivity.class);
        startActivity(intent1);
    }
}