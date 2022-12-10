package com.example.filimo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterRVFragmentDetail extends RecyclerView.Adapter<AdapterRVFragmentDetail.ViewHolder> {


    List<String> stringList;
    public AdapterRVFragmentDetail (List<String> stringList){
        this.stringList = stringList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_fragment_detail,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(holder.itemView.getContext())
                .load(stringList).centerCrop()
                .into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView ;

        public ViewHolder (@NonNull View itemView){
            super(itemView);
            this.imageView=itemView.findViewById(R.id.imageViewDetail);
        }

    }
}
