package com.example.shop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.R;
import com.example.shop.model.MainProduct;
import com.example.shop.model.Profile;

import java.util.List;

public class SubProductsAdapter extends RecyclerView.Adapter<SubProductsAdapter.SubProductHolder> {

    List<MainProduct> products;
    Context context;

    public SubProductsAdapter(List<MainProduct> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @Override
    public SubProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);

        return new SubProductHolder(view);
    }

    @Override
    public void onBindViewHolder(SubProductHolder holder, int position) {
        final MainProduct product=products.get(position);

        holder.txtName.setText(product.Name);
        holder.img.setImageResource(product.Image);
        holder.txtPrice.setText(String.valueOf(product.Price));

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class SubProductHolder extends RecyclerView.ViewHolder{

        public TextView txtPrice,txtName;
        public ImageView img;

        public SubProductHolder(View v) {
            super(v);
            txtPrice=v.findViewById(R.id.txt_price);
            img=v.findViewById(R.id.img_prd);
            txtName = v.findViewById(R.id.txt_prd_name);

        }
    }
}
