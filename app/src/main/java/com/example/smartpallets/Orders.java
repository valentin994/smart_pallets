package com.example.smartpallets;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Orders extends AppCompatActivity {

    String s1[], s2[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        s1 = getResources().getStringArray(R.array.programming_languages);
        s2 = getResources().getStringArray(R.array.description);

        rAdapter r_Adapter = new rAdapter( this, s1, s2);
        recyclerView.setAdapter(r_Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
