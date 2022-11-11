package com.example.data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class InsertActivity extends AppCompatActivity {
    EditText place_img, place_location, place_Desc, place_Name, place_Date;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        place_Desc = findViewById(R.id.place_Desc);
        place_img = findViewById(R.id.place_img);
        place_location = findViewById(R.id.place_Location);
        place_Name = findViewById(R.id.place_Name);
        place_Date = findViewById(R.id.place_Date);

        button = findViewById(R.id.button_Summit);

        DataBaseHelper dataBaseHelper = DataBaseHelper.getDB(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = place_Name.getText().toString();
                String image = place_img.getText().toString();
                String loc = place_location.getText().toString();
                String Desc = place_Desc.getText().toString();
                String Date = place_Date.getText().toString();



                dataBaseHelper.placeDao().addPlace(
                        new Place(name, loc, Date, Desc, image)
                );
            }
        });

    }
}