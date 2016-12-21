package com.example.glenn.transmitdata;

import android.content.Context;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.glenn.transmitdata.R.layout.list_cell_shopping_cart;

/**
 * Created by glenn on 21/12/2016.
 */
public class ViewHolderShoppingCart extends RecyclerView.ViewHolder {

    private Context context;
    private ImageView thumb;
    private TextView reference, name;
    private EditText quantite;
    private Product product;

    public ViewHolderShoppingCart(View itemView, Context context_) {
        super(itemView);

        context = context_;
        thumb = (ImageView) itemView.findViewById(R.id.thumbShoppingCart);
        reference = (TextView) itemView.findViewById(R.id.referenceShoppingCart);
        name = (TextView) itemView.findViewById(R.id.nameShoppingCart);
        quantite = (EditText) itemView.findViewById(R.id.editTextQuantite);

        final List<Pair<String,String>> productQuantite;

        quantite.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Log.e("*****",quantite.getText().toString());
//                productQuantite.add(reference.getText().toString(),quantite.getText().toString());
            }
        });

    }

    public void display(Product product_) {
        product = product_;
        thumb.setImageResource(product.getThumb());
        reference.setText(product.getReference());
        name.setText(product.getName());
    }
}
