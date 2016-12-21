package com.example.glenn.transmitdata;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btn_command;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<IProduct> products;
    private ArrayList<Product> productsCommand;
    private ArrayList<Parcelable> productsCommandParcel;
    private MenuItem shoppingCart;
    private Product prd;
    private ProductParcelable prdParcel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        shoppingCart = (MenuItem) findViewById(R.id.action_cart);
        btn_command = (Button) findViewById(R.id.btn_command);

        products = new ArrayList<IProduct>();
        Product p1 = new Product(1,R.drawable.chicken_rice,"NC001","Chicken & Rice 20kg","Croquet normal",false);
        Product p2 = new Product(2,R.drawable.premim,"NC002","Premium Chicken 20kg","Croquet premium",false);
        Product p3 = new Product(3,R.drawable.boeuf,"NC003","Boeuf 15kg","Croquet normal a base de boeuf",false);
        Product p4 = new Product(4,R.drawable.bl_junior,"BREED01","Top junior 20kg","Croquet Breedline pour chiot",false);
        Product p5 = new Product(5,R.drawable.bl_maintenance,"BREED02","Top maintenance 20Kg","Croquet Breedline",false);
        prd = p1;
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        mAdapter = new MyAdapter(getApplicationContext(),products);
        recyclerView.setAdapter(mAdapter);
        productsCommandParcel = new ArrayList<Parcelable>();
        productsCommand = new ArrayList<Product>();

        final ProductParcelable prdParcel = new ProductParcelable();

        btn_command.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<IProduct> productsList = ((MyAdapter) mAdapter).getProductsList();

                for(int i=0; i<productsList.size(); i++){
                    Product product = (Product) productsList.get(i);
                    if(product.isSelected){
                        productsCommandParcel.add(product);
                        productsCommand.add(product);
                        prdParcel.add(product);
                    }
                }
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.action_cart:{
                Intent IntentShoppingCartActivity = new Intent(MainActivity.this,ShoppingCartActivity.class);
                if(productsCommandParcel.size() > 0){

                }
                IntentShoppingCartActivity.putExtra("obj",(Serializable) productsCommand);
//                Log.e("*************", prdParcel.get(0).getName());
                startActivity(IntentShoppingCartActivity);
                return true;
            }

        }
        return super.onOptionsItemSelected(item);
    }

}
