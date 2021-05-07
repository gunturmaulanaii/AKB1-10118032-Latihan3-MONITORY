package com.example.monitory_10118032;
/*
 * NIM   : 10118032
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF-1
 * TGL   : 07/05/2021
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_masuk(View view) {
        Intent intent =  new Intent(this,BiodataActivity.class);
        startActivity(intent);
    }
}