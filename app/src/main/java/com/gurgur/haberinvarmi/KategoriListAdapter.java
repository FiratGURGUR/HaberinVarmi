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
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class KategoriListAdapter extends RecyclerView.Adapter<KategoriListAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView haberbasligi;
        public ImageView haberresmi;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            haberbasligi = itemView.findViewById(R.id.listDetail);
            haberresmi = itemView.findViewById(R.id.listPhoto);


        }
    }

    private List<KategoriListModel> user_list;
    private Context context;

    KategoriListAdapter(List<KategoriListModel> user_list, Context context){
        this.user_list = user_list;
        this.context = context;
    }

    @NonNull
    @Override
    public KategoriListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vr = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_kategori_list_item,parent,false);
        final KategoriListAdapter.ViewHolder view_holder = new KategoriListAdapter.ViewHolder(vr);



        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull KategoriListAdapter.ViewHolder holder, int position) {

        holder.haberbasligi.setText(user_list.get(position).getHaberBaslik());


        Glide.with(context)
                .load(user_list.get(position).getHaberResim())
                .into(holder.haberresmi);




    }

    @Override
    public int getItemCount() {
        return user_list.size();
    }




}