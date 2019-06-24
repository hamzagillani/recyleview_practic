package com.recyclerview;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {

    int[] images;
    String[] dog_titles;
    Context context;
    public  RecyclerAdapter(Context context, int[] images, String[] dog_names){
        this.context=context;
        this.images=images;
        this.dog_titles=dog_names;

    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_layout,viewGroup,false);
        ImageViewHolder imageViewHolder=new ImageViewHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int i) {

        int image_id=images[i];
        String name_id=dog_titles[i];
        holder.dog_album.setImageResource(image_id);
        holder.dog_names.setText(name_id);



    }

    @Override
    public int getItemCount() {
        return dog_titles.length;
    }
    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView dog_album;
        TextView  dog_names;


        public ImageViewHolder( View itemView) {
            super(itemView);
            dog_album=itemView.findViewById(R.id.dogs_album_id);
            dog_names=itemView.findViewById(R.id.dogs_title_id);
        }
    }
}
