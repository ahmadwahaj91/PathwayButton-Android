package com.db.pathwaybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import customlibraries.db.com.pathwaybutton.PathwayButton;

public class MainActivity extends AppCompatActivity {
    PathwayButton pathwayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pathwayButton = findViewById(R.id.pathway);
        pathwayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "You just pressed the Pathway Button", Toast.LENGTH_LONG).show();
            }
        });

    }
}
