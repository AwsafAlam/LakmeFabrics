package com.awsafalam.lakmefabrics;


import java.io.Serializable;

public class Listitem implements Serializable{

    private String Price;
     private String Description;
     private String imageuri;

    Listitem(){

    }


    Listitem(String price, String description, String imageuri) {
        Price = price;
        Description = description;
        this.imageuri = imageuri;
    }

    String getPrice() {
        return Price;
    }


    String getDescription() {
        return Description;
    }


    String getImageuri() {
        return imageuri;
    }


    public void setPrice(String price) {
        Price = price;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setImageuri(String imageuri) {
        this.imageuri = imageuri;
    }
}
