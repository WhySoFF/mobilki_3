package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().hide();
    }

    public void link1(View view) {

        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Aries");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=aries&day=today");
        startActivity(intent);
    }

    public void link2(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Taurus");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=taurus&day=today");
        startActivity(intent);
    }

    public void link3(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Gemini");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=gemini&day=today");
        startActivity(intent);
    }

    public void link4(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Cancer");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=cancer&day=today");
        startActivity(intent);
    }

    public void link5(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Leo");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=leo&day=today");
        startActivity(intent);
    }

    public void link6(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Vigro");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=vigro&day=today");
        startActivity(intent);
    }

    public void link7(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Libra");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=libra&day=today");
        startActivity(intent);
    }

    public void link8(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Scorpio");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=scorpio&day=today");
        startActivity(intent);
    }

    public void link9(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Sagittarius");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=sagittarius&day=today");
        startActivity(intent);
    }

    public void link10(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Capricirn");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=capricorn&day=today");
        startActivity(intent);
    }

    public void link11(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Aquarius");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=aquarius&day=today");
        startActivity(intent);
    }

    public void link12(View view) {
        Intent intent = new Intent(this, HoroscopeActivity.class);
        intent.putExtra("name", "Pisces");
        intent.putExtra("url", "https://aztro.sameerkumar.website/?sign=pisces&day=today");
        startActivity(intent);
    }
}