package com.example.shop.model;

import com.example.shop.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainProduct {

    public String Name;
    public int Image;
    public int Price;

    public MainProduct(String Name, int Image, int Price) {
        this.Name = Name;
        this.Image = Image;
        this.Price = Price;
    }

    public static final ArrayList<MainProduct> MAIN_PRODUCTS = new ArrayList<>(Arrays.asList(
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100),
            new MainProduct("Product Service", R.drawable.img_product,100)
    ));
}
