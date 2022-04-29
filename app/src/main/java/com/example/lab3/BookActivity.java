package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        PageFragment firstFragment=PageFragment.getNewInstance(1);
        PageFragment secondFragment=PageFragment.getNewInstance(2);
        PageFragment thirdFragment=PageFragment.getNewInstance(3);

        List<Fragment> pages= new LinkedList<>();
        pages.add(firstFragment);
        pages.add(secondFragment);
        pages.add(thirdFragment);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.vpMain);
        viewPager.setAdapter(vpAdapter);

        vpAdapter.setPages(pages);

    }
}