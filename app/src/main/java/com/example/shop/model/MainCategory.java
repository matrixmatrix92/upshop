package com.example.shop.model;

import com.example.shop.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainCategory {
    public String CategoryName;
    public int CategoryImage;

    public MainCategory(String name, int source){
        this.CategoryName = name;
        this.CategoryImage = source;
    }

    public static final ArrayList<MainCategory> SUB_CATEGORIES = new ArrayList<MainCategory>(
            Arrays.asList(
                    new MainCategory("Sub Category1", R.drawable.img_sub_cat),
                    new MainCategory("Sub Category2", R.drawable.img_sub_cat),
                    new MainCategory("Sub Category3", R.drawable.img_sub_cat),
                    new MainCategory("Sub Category4", R.drawable.img_sub_cat),
                    new MainCategory("Sub Category5", R.drawable.img_sub_cat),
                    new MainCategory("Sub Category6", R.drawable.img_sub_cat),
                    new MainCategory("Sub Category7", R.drawable.img_sub_cat)
            )
    );

    public static final ArrayList<MainCategory> CATEGORIES = new ArrayList<MainCategory>(
            Arrays.asList(
                    new MainCategory("Main Category1", R.drawable.img_cat),
                    new MainCategory("Main Category2", R.drawable.img_cat),
                    new MainCategory("Main Category3", R.drawable.img_cat),
                    new MainCategory("Main Category4", R.drawable.img_cat),
                    new MainCategory("Main Category5", R.drawable.img_cat),
                    new MainCategory("Main Category6", R.drawable.img_cat),
                    new MainCategory("Main Category7", R.drawable.img_cat)
            )
    );


}
