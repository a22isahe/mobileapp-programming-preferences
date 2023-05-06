package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences MyRef;
    private SharedPreferences.Editor MyRefEditor;
    Button button;
  TextView viewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewText = findViewById(R.id.viewText);
        button = findViewById(R.id.button);
        MyRef = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         Intent Second = new Intent(MainActivity.this, SecondActivity.class);

         startActivity(Second);
            }
        });




    }

    @Override
    protected void onResume() {
        super.onResume();

        viewText.setText(MyRef.getString("Text","empty"));

    }
}
