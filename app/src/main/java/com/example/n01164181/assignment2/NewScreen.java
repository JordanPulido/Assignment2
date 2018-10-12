package com.example.n01164181.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class NewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_screen);

        Intent intent = getIntent();

        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.display_message);
        textView.setText(message);
    }

}
