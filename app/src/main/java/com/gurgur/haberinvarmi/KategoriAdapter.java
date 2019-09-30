package com.gurgur.haberinvarmi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class KategoriAdapter  extends RecyclerView.Adapter<KategoriAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView kategoriadi;
        public ImageView kategoriresmi;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            kategoriadi = itemView.findViewById(R.id.textView11);
            kategoriresmi = itemView.findViewById(R.id.imageView3);

        }
    }

    private List<KategoriModel> user_list;
    private Context context;

    KategoriAdapter(List<KategoriModel> user_list, Context context){
        this.user_list = user_list;
        this.context = context;
    }

    @NonNull
    @Override
    public KategoriAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vr = LayoutInflater.from(parent.getContext()).inflate(R.layout.kategori_item,parent,false);
        final  ViewHolder view_holder = new ViewHolder(vr);



        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.kategoriadi.setText(user_list.get(position).getKategoriBaslik());

        Glide.with(context)
        .load(user_list.get(position).getKategoriResim())
                .into(holder.kategoriresmi);




    }

    @Override
    public int getItemCount() {
        return user_list.size();
    }




}