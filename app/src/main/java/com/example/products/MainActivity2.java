package com.example.products;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;
    int itemPosition;
    Product product ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
          intent = getIntent();
          itemPosition = intent.getIntExtra("position",-1);
          product=DataModel.productList.get(itemPosition);
    }
}