package com.example.glenn.transmitdata;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by glenn on 21/12/2016.
 */
public class Order {
    private int id_order, id_user;
    private Date created_at;

    public Order(){
        created_at = new Date();
    }

    public int getId_order(){
        return id_order;
    }

    public void setId_order(int id_order_){
        id_order = id_order;
    }

    public int getId_user(){
        return id_user;
    }

    public void setId_user(int id_user_){
        id_user = id_user_;
    }

    public Date getCreated_at(){
        return created_at;
    }
}