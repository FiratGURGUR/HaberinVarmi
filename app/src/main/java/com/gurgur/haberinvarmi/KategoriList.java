package com.gurgur.haberinvarmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class KategoriList extends AppCompatActivity {
    RecyclerView recyclerView;
    KategoriListAdapter katAdapter;
    List<KategoriListModel> katModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_list);



        recyclerView = findViewById(R.id.recycler_kategori_list);
        katModelList = new ArrayList<>();


        katModelList.add(new KategoriListModel(R.drawable.image_1,"Define avcılarına suçüstü!"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Son dakika | Marmaris açıklarında deprem!"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Son dakika! Jandarmaları taşıyan midibüsle TIR çarpıştı!"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Ajanslar biraz önce geçti! 3 il için uyarı: Çok kuvvetli olacak"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Şoke eden iddia: Evli olmasına rağmen benim kızımı..."));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Kayıp emekli polis, kuyuda başından vurulmuş halde bulundu"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Antalya’da genç kızların sosyal medya tartışması kanlı bitti"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Define avcılarına suçüstü!"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Son dakika | Marmaris açıklarında deprem!"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Son dakika! Jandarmaları taşıyan midibüsle TIR çarpıştı!"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Ajanslar biraz önce geçti! 3 il için uyarı: Çok kuvvetli olacak"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Şoke eden iddia: Evli olmasına rağmen benim kızımı..."));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Kayıp emekli polis, kuyuda başından vurulmuş halde bulundu"));
        katModelList.add(new KategoriListModel(R.drawable.image_1,"Antalya’da genç kızların sosyal medya tartışması kanlı bitti"));
        katAdapter =new KategoriListAdapter(katModelList,this);



        StaggeredGridLayoutManager linearLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        linearLayoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(katAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
