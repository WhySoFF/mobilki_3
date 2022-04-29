package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

public class RecomendationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendation);
        getSupportActionBar().hide();
        Bundle arguments = getIntent().getExtras();
        TextView textView = findViewById(R.id.textView8);
        textView.setText(arguments.getString("title"));
        TextView textViewDesc = findViewById(R.id.textView7);
        textViewDesc.setText(arguments.getString("description"));
    }
}