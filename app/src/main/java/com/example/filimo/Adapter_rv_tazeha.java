package com.example.filimo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class Adapter_rv_tazeha extends RecyclerView.Adapter<Adapter_rv_tazeha.ViewHolder> {
    public OnItemClickListener listener;
    ArrayList<Model_recycler> stringList2;

    public Adapter_rv_tazeha (ArrayList<Model_recycler> stringList, OnItemClickListener listener){
        this.stringList2=stringList;
        this.listener = listener;
    }


    @NonNull
    @Override
    public Adapter_rv_tazeha.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_two,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_rv_tazeha.ViewHolder holder, int position) {

       holder.textView.setText(stringList2.get(position).getTitle());
        Glide.with(holder.itemView.getContext())
                .load(stringList2.get(position).getImage())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(14)))
                .into(holder.imageView1);
        holder.itemView.setOnClickListener(v -> {
            listener.onItemClick(stringList2.get(position).getTitle());
        });
    }

    @Override
    public int getItemCount() {
        return stringList2.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView1;
        private TextView textView;


        public ViewHolder (@NonNull View itemView){

            super(itemView);
            this.imageView1 = itemView.findViewById(R.id.imageViewTwo);
            this.textView = itemView.findViewById(R.id.tv_rv);
        }

    }
}
