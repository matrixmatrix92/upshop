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
import com.example.shop.model.Profile;

import java.util.List;

public class ProfilesAdapter extends RecyclerView.Adapter<ProfilesAdapter.ProfileViewHolder> {

    List<Profile> profiles;
    Context context;

    public ProfilesAdapter(List<Profile> profiles, Context context) {
        this.profiles = profiles;
        this.context = context;
    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile,parent,false);

        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, int position) {
        final Profile profile=profiles.get(position);

        holder.txt.setText(profile.ProfileName);
        holder.img.setImageResource(profile.ProfileImage);

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder{

        public TextView txt;
        public ImageView img;

        public ProfileViewHolder(View v) {
            super(v);
            txt=v.findViewById(R.id.txt_profile);
            img=v.findViewById(R.id.img_profile);

        }
    }
}