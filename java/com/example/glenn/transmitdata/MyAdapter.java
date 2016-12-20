package com.example.glenn.transmitdata;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by glenn on 19/12/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private final List<Product> products = Arrays.asList(
            new Product(1,R.drawable.chicken_rice,"NC001","Chicken & Rice 20kg","Croquet normal",false),
            new Product(2,R.drawable.premim,"NC002","Premium Chicken 20kg","Croquet premium",false),
            new Product(3,R.drawable.boeuf,"NC003","Boeuf 15kg","Croquet normal a base de boeuf",false),
            new Product(4,R.drawable.bl_junior,"BREED01","Top junior 20kg","Croquet Breedline pour chiot",false),
            new Product(5,R.drawable.bl_maintenance,"BREED02","Top maintenance 20Kg","Croquet Breedline",false)
    );
    private Context context;
    private Button btn_command;

    public MyAdapter(Context context_){
        context = context_;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View vue_cell = inflater.inflate(R.layout.list_cell,parent,false);
        return new MyViewHolder(vue_cell,context);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Product product = products.get(position);
        holder.display(product);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


}
