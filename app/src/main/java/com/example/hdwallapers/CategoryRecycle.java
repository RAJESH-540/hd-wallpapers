package com.example.hdwallapers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryRecycle extends RecyclerView.Adapter<CategoryRecycle.ViewHolder> {
    private ArrayList<category_model> category_modelArrayList;
    private Context context;

    public CategoryRecycle(ArrayList<category_model> category_modelArrayList, Context context) {
        this.category_modelArrayList = category_modelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.category_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(category_modelArrayList.get(position).getImageView());
        holder.textView.setText(category_modelArrayList.get(position).getTitles());

    }

    @Override
    public int getItemCount() {
        return category_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_cat);
            textView=itemView.findViewById(R.id.text_cat);
        }
    }
}
