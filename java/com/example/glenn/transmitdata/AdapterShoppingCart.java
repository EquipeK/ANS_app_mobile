package com.example.glenn.transmitdata;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by glenn on 21/12/2016.
 */
public class AdapterShoppingCart extends RecyclerView.Adapter<ViewHolderShoppingCart> {

    private Context context;
    private ArrayList<Product> productsToCommand;
    public AdapterShoppingCart(Context context_, ArrayList<Product> productsToCommand_){
        context = context_;
        productsToCommand = productsToCommand_;
    }

    @Override
    public ViewHolderShoppingCart onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View vue_cell = inflater.inflate(R.layout.list_cell_shopping_cart,parent,false);
        return new ViewHolderShoppingCart(vue_cell,context);
    }

    @Override
    public void onBindViewHolder(ViewHolderShoppingCart holder, int position) {
        final Product product = productsToCommand.get(position);
        holder.display(product);
    }

    @Override
    public int getItemCount() {
        return productsToCommand.size();
    }
}
