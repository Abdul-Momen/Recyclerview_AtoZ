package com.example.recyclerviewatoz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {

    Context context;
    List<FoodModel> arrayList;
    String text;

//    public FoodAdapter(Context context, List<FoodModel> arrayList) {
//        this.context = context;
//        this.arrayList = arrayList;
//    }


    public FoodAdapter(Context context, List<FoodModel> arrayList, String text) {
        this.context = context;
        this.arrayList = arrayList;
        this.text = text;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layout=R.layout.item_row;
        if (text.equals("one")){
            layout=R.layout.item_row;
        }else if (text.equals("two")){
            layout=R.layout.item_row2;
        }else if (text.equals("three")){
            layout=R.layout.girditem_row;
        }

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(layout, parent, false);

        return new FoodAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

     final    FoodModel foodModel =arrayList.get(position);

        holder.name.setText(foodModel.getName());
        holder.like.setText(foodModel.getName());
        holder.image.setImageDrawable(context.getResources().getDrawable(foodModel.getImage()));

       // Glide.with(context).load(FoodModel.getImage()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,like;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            name=itemView.findViewById(R.id.tv_name_id);
            like=itemView.findViewById(R.id.tv_like_id);
            image=itemView.findViewById(R.id.tv_image_id);

        }
    }
}
