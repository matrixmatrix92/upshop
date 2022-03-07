package com.example.shop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.R;
import com.example.shop.model.MainCategory;

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.MainCategoryViewHolder> {

    List<MainCategory> categories;
    Context context;

    public SubCategoryAdapter(List<MainCategory> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @Override
    public MainCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sub_catgory,parent,false);

        return new MainCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainCategoryViewHolder holder, int position) {
        final MainCategory category=categories.get(position);

        holder.txtCategory.setText(category.CategoryName);
        holder.imgCategory.setImageResource(category.CategoryImage);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class MainCategoryViewHolder extends RecyclerView.ViewHolder{

        public TextView txtCategory;
        public ImageView imgCategory;

        public MainCategoryViewHolder(View v) {
            super(v);
            txtCategory=v.findViewById(R.id.txt_cat);
            imgCategory=v.findViewById(R.id.img_cat);

        }
    }
}