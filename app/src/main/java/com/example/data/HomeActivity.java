package com.example.data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button button_Search, button_Update, button_Delete, button_Insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button_Delete = findViewById(R.id.button_Delete);
        button_Insert = findViewById(R.id.button_Insert);
        button_Search = findViewById(R.id.button_Search);
        button_Update = findViewById(R.id.button_Update);

        button_Insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, InsertActivity.class);
                startActivity(intent);
            }
        });

        button_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });
    }
}