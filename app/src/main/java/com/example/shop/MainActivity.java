package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridView;

import com.example.shop.adapter.MainCategoryAdapter;
import com.example.shop.adapter.ProductsAdapter;
import com.example.shop.adapter.ProfilesAdapter;
import com.example.shop.adapter.SubCategoryAdapter;
import com.example.shop.adapter.SubProductsAdapter;
import com.example.shop.model.MainCategory;
import com.example.shop.model.MainProduct;
import com.example.shop.model.Profile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupSearch();
        setupMainCategories();
        setupProducts();
        setupProfiles();
        setupSubCategories();
        setupSubProducts();
    }

    private void setupSearch() {
        EditText editText = (EditText) findViewById(R.id.editText);

        int iconSize = (int) getResources().getDimension(R.dimen.iconSize);

        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.img_search1);
        drawable.setBounds(0, 0, iconSize * 3, 0); // that is the trick!

        editText.setCompoundDrawables(null, null, drawable, null);
    }

    private void setupMainCategories() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerMainCategories);

        MainCategoryAdapter adapter = new MainCategoryAdapter(MainCategory.CATEGORIES,this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setupProducts() {
        ProductsAdapter adapter = new ProductsAdapter(this,MainProduct.MAIN_PRODUCTS);
        GridView gridView = (GridView) findViewById(R.id.grid_products);
        gridView.setAdapter(adapter);
    }

    private void setupProfiles() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerProfiles);

        ProfilesAdapter adapter = new ProfilesAdapter(Profile.PROFILES, this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setupSubCategories() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerSubCategories);

        SubCategoryAdapter adapter = new SubCategoryAdapter(MainCategory.SUB_CATEGORIES,this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setupSubProducts() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerSubProducts);

        SubProductsAdapter adapter = new SubProductsAdapter(MainProduct.MAIN_PRODUCTS, this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}