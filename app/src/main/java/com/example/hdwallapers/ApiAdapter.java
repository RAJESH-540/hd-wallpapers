package com.example.hdwallapers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;

import java.util.List;

public class ApiAdapter extends RecyclerView.Adapter<ApiAdapter.MyHolder> {
   private Context context;
   private List<Wallpaper> photosModelList;

    public ApiAdapter(Context context, List<Wallpaper> photosModelList) {
        this.context = context;
        this.photosModelList = photosModelList;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
//        holder.textView.setText(photosModelList.get(position).getUserName());
        Glide.with(holder.imageView.getContext())
                .load(photosModelList.get(position).getURLImage())
                .transform(new CenterInside(),new CenterCrop())
                .into(holder.imageView);
        //
    }

    @Override
    public int getItemCount() {
        if (photosModelList ==null)
            return 0;

        return photosModelList.size();
    }

    public  class MyHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;



        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_view);
//            textView=itemView.findViewById(R.id.title);


        }
    }
}
