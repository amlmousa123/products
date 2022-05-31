package com.example.products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView productsRV;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productsRV = findViewById(R.id.rv);
        productsAdapter adapter = new productsAdapter(DataModel.productList);
        productsRV.setAdapter(adapter);
        productsRV.setLayoutManager(new LinearLayoutManager(this));
       // intent =new Intent(this,MainActivity2.class);

    }
    /*public void goToNextActivity(View view){
        int position = productsRV.getChildLayoutPosition(view);
       intent.putExtra("position",position);
       startActivity(intent);
    }
*/

}
