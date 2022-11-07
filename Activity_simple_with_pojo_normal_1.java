package com.example.recyclerviewsample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Activity_simple_with_pojo_normal_1 extends AppCompatActivity {

    List<Product1> product1List;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        product1List = new ArrayList<>();

        product1List = new ArrayList<>();



        //adding some items to our list
        product1List.add(
                new Product1(
                        1,
                        "3 McLaren 570S",
                        "5204cc, 10 cylinders",
                        9.3,
                        700000,
                        R.drawable.aa)
        );

        product1List.add(
                new Product1(
                        2,
                        "4 Mercedes-AMG GT",
                        "2981cc, 6 cylinders",
                        5.3,
                        100000,
                        R.drawable.bb));

        product1List.add(
                new Product1(
                        1,
                        "5 BMW i8",
                        "3799cc, 8 cylinders S (£110,500)",
                        8.3,
                        80000,
                        R.drawable.dd));

        product1List.add(
                new Product1(
                        1,
                        "3 McLaren 570S",
                        "Mercedes-AMG GT S (£110,500)",
                        8.3,
                        60000,
                        R.drawable.ee));

        //creating recyclerview adapter
    ProductAdapter_1 adapter = new ProductAdapter_1(this, product1List);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }
}