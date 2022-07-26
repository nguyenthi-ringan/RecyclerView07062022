package com.example.recyclerview07062022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvFood;
    FoodAdapter foodAdapter;
    List<Food> foodList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvFood = findViewById(R.id.recycler_view_food);
        foodList = Food.getMock();
        foodAdapter = new FoodAdapter(foodList);
        rcvFood.setHasFixedSize(true);
        rcvFood.setAdapter(foodAdapter);
    }
}