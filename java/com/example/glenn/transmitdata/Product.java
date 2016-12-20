package com.example.glenn.transmitdata;

/**
 * Created by glenn on 19/12/2016.
 */
public class Product {
    private int id; int thumb;
    private String reference, name, describe;
    public boolean isSelected;
    public Product(){

    }

    public Product(int id_,int thumb_,String reference_, String name_, String describe_, boolean isSelected_){
        id = id_; thumb = thumb_;reference = reference_; name = name_; describe = describe_;  isSelected = isSelected_;
    }

    public int getId(){
        return id;
    }

    public void setId(int id_){ id = id_;}

    public String getReference(){
        return reference;
    }

    public void setReference(String reference_){
        reference = reference_;
    }

    public String getName(){
        return name;
    }

    public void setName(String name_){
        name = name_;
    }

    public String getDescribe(){
        return describe;
    }

    public void setDescribe(String describe_){
        describe = describe_;
    }

    public int getThumb(){
        return thumb;
    }

    public void setThumb(int thumb_){
        thumb = thumb_;
    }

}
