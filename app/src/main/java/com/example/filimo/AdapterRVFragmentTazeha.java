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

public class AdapterRVFragmentTazeha extends RecyclerView.Adapter<AdapterRVFragmentTazeha.ViewHolder> {

    ArrayList<Model_recycler> stringList2;

    public AdapterRVFragmentTazeha (ArrayList<Model_recycler> stringList){
        this.stringList2=stringList;
    }


    @NonNull
    @Override
    public AdapterRVFragmentTazeha.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_two,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRVFragmentTazeha.ViewHolder holder, int position) {

        holder.textView2.setText(stringList2.get(position).getTitle());
        Glide.with(holder.itemView.getContext())
                .load(stringList2.get(position).getImage())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(14)))
                .into(holder.imageView2);

    }

    @Override
    public int getItemCount() {
        return stringList2.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView2;
        private TextView textView2;


        public ViewHolder (@NonNull View itemView){

            super(itemView);
            this.imageView2 = itemView.findViewById(R.id.imageViewFragmentVizhe);
            this.textView2= itemView.findViewById(R.id.textViewFragmentVizhe);
        }

    }
}
