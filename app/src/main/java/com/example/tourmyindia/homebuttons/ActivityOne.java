package com.example.tourmyindia.homebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.tourmyindia.Activity2;
import com.example.tourmyindia.R;
import com.example.tourmyindia.Somnath;

public class ActivityOne extends AppCompatActivity {

    ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        btn = findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityOne.this, Somnath.class);
                startActivity(intent);
            }
        });
    }
}