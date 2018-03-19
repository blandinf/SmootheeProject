package com.example.blandinf.smootheeproject.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.blandinf.smootheeproject.R;

public class HomeActivity extends AppCompatActivity {

    private Button _smoothieSearch_button;
    private Button _smoothieFruits_button;
    private Button _smoothieList_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        _smoothieSearch_button = (Button) findViewById(R.id.smoothieSearch);
        _smoothieFruits_button = (Button) findViewById(R.id.smoothieFruits);
        _smoothieList_button = (Button) findViewById(R.id.smoothieList);

        _smoothieSearch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smoothieSearchIntent = new Intent(getApplicationContext(),SmoothieSearch.class);
                startActivity(smoothieSearchIntent);
            }
        });

        _smoothieFruits_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smoothieFruitsIntent = new Intent(getApplicationContext(),SmoothiesFruits.class);
                startActivity(smoothieFruitsIntent);
            }
        });

        _smoothieList_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smoothieListIntent = new Intent(getApplicationContext(),SmoothiesList.class);
                startActivity(smoothieListIntent);
            }
        });


    }
}
