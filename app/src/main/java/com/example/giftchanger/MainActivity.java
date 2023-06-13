package com.example.giftchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private ImageButton Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button = findViewById(R.id.button2);
        Button.setOnClickListener(this);


        }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
        finish();
    }
}

