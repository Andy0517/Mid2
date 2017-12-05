package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {
    int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void roll(View view){
        number = new Random().nextInt(5)+1;
        new AlertDialog.Builder(this)
                .setTitle("Number")
                .setMessage("your number is:"+number)
                .setPositiveButton("again",null)
                .show();
    }


}
