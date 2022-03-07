package com.example.shop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shop.R;
import com.example.shop.model.MainProduct;

import java.util.List;

public class ProductsAdapter extends BaseAdapter {

    List<MainProduct> productList;
    Context mContext;

    public ProductsAdapter(Context mContext, List<MainProduct> productList){
        this.mContext=mContext;
        this.productList = productList;
    }
    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public MainProduct getItem(int i) {
        return productList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
            view= LayoutInflater.from(mContext).inflate(R.layout.item_product, viewGroup,false);

        ImageView img =  view.findViewById(R.id.img_prd); // get the reference of ImageView
        TextView txtName=(TextView) view.findViewById(R.id.txt_prd_name);
        TextView txtPrice = (TextView) view.findViewById(R.id.txt_price);

        MainProduct product=getItem(i);
        txtName.setText(product.Name);
        txtPrice.setText(String.valueOf(product.Price));
        img.setImageResource(product.Image);

        return view;
    }
}
