package com.example.filimo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRVFragmentDetailComment extends RecyclerView.Adapter<AdapterRVFragmentDetailComment.ViewHolder> {

    List<String> stringList;

    public AdapterRVFragmentDetailComment(List<String> stringList){
        this.stringList=stringList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_fragment_detail_comment,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(stringList.get(position));


    }

    @Override
    public int getItemCount() {
        return stringList.size();




    }

    public static class ViewHolder extends RecyclerView.ViewHolder{


        public TextView textView ;

        public ViewHolder (@NonNull View itemView){
            super (itemView);
            this.textView=itemView.findViewById(R.id.textViewcomment);
        }
    }
}
