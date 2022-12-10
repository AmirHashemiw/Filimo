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

import java.util.List;
import java.util.Locale;

public class Adapter_rv_vizhe extends RecyclerView.Adapter<Adapter_rv_vizhe.ViewHolder>  {
    public OnItemClickListenerVizhe listener ;
    List<ModelMovieVizhe> stringList1;

    public Adapter_rv_vizhe(List<ModelMovieVizhe> stringList, OnItemClickListenerVizhe onItemClickListener) {
        this.stringList1 = stringList;
        listener=onItemClickListener;
    }


    @NonNull
    @Override
    public Adapter_rv_vizhe.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_one, parent, false);
        return new ViewHolder(view);
    }

    @Override
    @NonNull
    public void onBindViewHolder(@NonNull Adapter_rv_vizhe.ViewHolder holderVizhe, int position) {

        Glide.with(holderVizhe.itemView.getContext())
                .load(stringList1.get(position).getImage())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(14)))
                .into(holderVizhe.imageView1);
        holderVizhe.itemView.setOnClickListener(v -> {
            listener.onItemClick(stringList1.get(position));
        });

    }

    @Override
    public int getItemCount() {
        return stringList1.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView1;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            this.imageView1 = itemView.findViewById(R.id.imageViewOne);
        }

    }
}
