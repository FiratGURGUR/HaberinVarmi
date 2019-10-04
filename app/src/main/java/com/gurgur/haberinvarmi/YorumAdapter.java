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

public class YorumAdapter extends RecyclerView.Adapter<YorumAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView kullaniciad;
        public TextView yorum;
        public ImageView userImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            kullaniciad = itemView.findViewById(R.id.textView22);
            yorum = itemView.findViewById(R.id.textView24);
            userImage = itemView.findViewById(R.id.imageView16);

        }
    }

    private List<YorumModel> user_list;
    private Context context;

    YorumAdapter(List<YorumModel> user_list, Context context){
        this.user_list = user_list;
        this.context = context;
    }

    @NonNull
    @Override
    public YorumAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vr = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_yorum_item,parent,false);
        final YorumAdapter.ViewHolder view_holder = new YorumAdapter.ViewHolder(vr);



        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull YorumAdapter.ViewHolder holder, int position) {

        holder.kullaniciad.setText(user_list.get(position).getUserName());
        holder.yorum.setText(user_list.get(position).getYorum());

        Glide.with(context)
                .load(user_list.get(position).getUserPhotoUrl())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.userImage);




    }

    @Override
    public int getItemCount() {
        return user_list.size();
    }




}