package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Bundle arguments = getIntent().getExtras();
        FirebaseUser currentUser = (FirebaseUser) arguments.get("current_user");
        TextView textView=findViewById(R.id.textView);
        textView.setText(currentUser.getEmail());
    }
}