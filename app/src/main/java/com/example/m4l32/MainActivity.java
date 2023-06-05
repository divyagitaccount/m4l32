package com.example.m4l32;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button submit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customdatatype[] d = new customdatatype[6];
        d[0] = new customdatatype("Ankit","Male","ankitjadli26@gmail.com","Delhi","9857423658");
        d[1] = new customdatatype("Aashni","Female","aashnasharma22@gmail.com","Delhi","8956147552");
        d[2] = new customdatatype("Shubha","Female","shubhangi11@gmail.com","Delhi","9856324785");
        d[3] = new customdatatype("Atul","Male","atulsingh666@gmail.com","Delhi","9257415836");
        d[4] = new customdatatype("tina","Male","utkarshanand123@gmail.com","Delhi","8423365521");
        d[5] = new customdatatype("Vina","Male","vernit.garg@gmail.com","Delhi","9999865742");



        submit = findViewById(R.id.button);
        Random randomNumber = new Random();
        submit.setOnClickListener(view -> {
            int numberGenerated = randomNumber.nextInt(6);
            Log.i("Person we got : ", " Name : "+d[numberGenerated].username+
                    " Gender : "+d[numberGenerated].usergender+" State : "+d[numberGenerated].userstate+
                    " Phone : "+d[numberGenerated].userphone);
        });

    }
}