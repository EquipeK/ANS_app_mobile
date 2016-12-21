package com.example.glenn.transmitdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingCartActivity extends AppCompatActivity {

    private RecyclerView recyclerViewShoppingCart;
    private RecyclerView.Adapter adapterShoppingCart;
    private RecyclerView.LayoutManager layoutManagerShoppingManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        Intent i = new Intent();
        Bundle b = i.getExtras();

        ArrayList<Product> arrayListp =  getIntent().getParcelableArrayListExtra("obj");

        recyclerViewShoppingCart = (RecyclerView) findViewById(R.id.recyclerShoppingCart);
        recyclerViewShoppingCart.setLayoutManager(new LinearLayoutManager(this));

        adapterShoppingCart = new AdapterShoppingCart(getApplicationContext(),arrayListp);
        recyclerViewShoppingCart.setAdapter(adapterShoppingCart);

    }
}
