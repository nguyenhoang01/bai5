package com.example.bai5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);
    }
    public void onBackTelephoneClick(View view) {
        Intent intent = new Intent(this, TelePhoneDirecActivity.class);
        startActivity(intent);
    }
}