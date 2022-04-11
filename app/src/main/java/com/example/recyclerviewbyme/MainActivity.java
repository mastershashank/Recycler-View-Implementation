package com.example.recyclerviewbyme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<FoodModel> foods = new ArrayList<>();
        foods.add(new FoodModel(R.drawable.icecreams, "IceCreams"));
        foods.add(new FoodModel(R.drawable.coffee, "Coffee"));
        foods.add(new FoodModel(R.drawable.paztaa, "Pazta"));
        foods.add(new FoodModel(R.drawable.burgerr, "Burger"));
        foods.add(new FoodModel(R.drawable.pizzaa, "Pizza"));
        foods.add(new FoodModel(R.drawable.samosaa, "Samosa"));
        foods.add(new FoodModel(R.drawable.sandwitch, "Sandwitch"));
        foods.add(new FoodModel(R.drawable.winee, "Wine"));
        foods.add(new FoodModel(R.drawable.biryanii, "Biryani"));

        FoodAdapter adapter = new FoodAdapter(foods , this);
        recyclerView.setAdapter(adapter);

        // LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}