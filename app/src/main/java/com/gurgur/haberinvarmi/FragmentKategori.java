package com.gurgur.haberinvarmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentKategori extends Fragment {

    RecyclerView recyclerView;
    KategoriAdapter userAdapter;
    List<KategoriModel> userModelList;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kategori,container,false);

        recyclerView = view.findViewById(R.id.recycle_kategori);
        userModelList = new ArrayList<>();


        userModelList.add(new KategoriModel(R.drawable.kategori_gundem,"Gündem"));
        userModelList.add(new KategoriModel(R.drawable.kategori_spor,"Spor"));
        userModelList.add(new KategoriModel(R.drawable.kategori_finans,"Finans"));
        userModelList.add(new KategoriModel(R.drawable.kategori_saglik,"Sağlık"));
        userModelList.add(new KategoriModel(R.drawable.kategori_dunya,"Dünya"));
        userModelList.add(new KategoriModel(R.drawable.kategori_sondakika,"Son Dakika"));

        userAdapter =new KategoriAdapter(userModelList, getActivity(), new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent ıntent = new Intent(getActivity(),KategoriList.class);
                startActivity(ıntent);
            }
        });


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        linearLayoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());



        return view;
    }
}
