package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
private String SHARED ;
   private SharedPreferences shared;
    private SharedPreferences.Editor editor;


 Button button;
 EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.button2);
        text = findViewById(R.id.editTextText);
        shared = getSharedPreferences("SHARED_PREF",MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                saveToPreference();
            }
        });

    }



    public void saveToPreference(){

        editor = shared.edit();
        editor.putString("Text", text.getText().toString());
        editor.apply();

    }


}