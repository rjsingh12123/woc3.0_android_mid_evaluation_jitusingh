package com.rjsingh.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton btnMon, btnTue, btnWed, btnThur, btnFri, btnSat;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMon = findViewById(R.id.btn_mon);
        btnTue = findViewById(R.id.btn_tue);
        btnWed = findViewById(R.id.btn_wed);
        btnThur = findViewById(R.id.btn_thur);
        btnFri = findViewById(R.id.btn_fri);
        btnSat = findViewById(R.id.btn_sat);

        btnMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MonActivity.class);
                startActivity(intent);
            }
        });

        btnTue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), TueActivity.class);
                startActivity(intent);
            }
        });

        btnWed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), WedActivity.class);
                startActivity(intent);
            }
        });

        btnThur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), ThurActivity.class);
                startActivity(intent);
            }
        });

        btnFri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), FriActivity.class);
                startActivity(intent);
            }
        });

        btnSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), SatActivity.class);
                startActivity(intent);
            }
        });
    }
}