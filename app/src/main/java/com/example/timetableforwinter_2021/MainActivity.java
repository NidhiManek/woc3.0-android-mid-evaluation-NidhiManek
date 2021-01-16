package com.example.timetableforwinter_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String DAY="Timetable.day";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view){
        Intent intent=new Intent(this,displayActivity.class);
        String day=view.getTag().toString();
        intent.putExtra(DAY,day);
        startActivity(intent);
    }

    public void display_saturday(View view){
        Intent intent=new Intent(this,display_saturday.class);
        startActivity(intent);
    }
}