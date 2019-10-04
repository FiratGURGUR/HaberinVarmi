package com.gurgur.haberinvarmi;

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

public class FragmentYorum extends Fragment {
    RecyclerView recyclerView;
    YorumAdapter yorumAdapter;
    List<YorumModel> yorumModelList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yorum,container,false);



        recyclerView = view.findViewById(R.id.recycler_yorum);
        yorumModelList = new ArrayList<>();


        yorumModelList.add(new YorumModel("Fırat Gürgür","Yinelenen bir sayfa içeriğinin okuyucunun dikkatini dağıttığı bilinen bir gerçektir.",R.drawable.firat));
        yorumModelList.add(new YorumModel("Nurdan Albaş","Acıyı seven, arayan ve ona sahip olmak isteyen hiç kimse yoktur. Nedeni basit. Çünkü o acıdır...",R.drawable.nurdan));
        yorumModelList.add(new YorumModel("Tuğba Ay","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...",R.drawable.tugba));
        yorumModelList.add(new YorumModel("Kıvanç Tatlıtuğ","yinelemelerden, mizahtan ve karakteristik olmayan sözcüklerden uzaktır.",R.drawable.kivanc));
        yorumModelList.add(new YorumModel("Adriana Lima","Çiçero tarafından M.Ö. 45 tarihinde kaleme alınan \"de Finibus Bonor",R.drawable.adriana));
        yorumModelList.add(new YorumModel("Scarlett Johansson","Hampden-Sydney College'dan Latince profesörü Richard McClintock,",R.drawable.scarlett));
        yorumModelList.add(new YorumModel("Fırat Gürgür","Yinelenen bir sayfa içeriğinin okuyucunun dikkatini dağıttığı bilinen bir gerçektir. Acıyı seven, arayan ve ona sahip olmak isteyen hiç kimse yoktur.Çiçero tarafından M.Ö. 45 tarihinde kaleme alınan \"de Finibus Bonor Nedeni basit. Çünkü o acıdır... ",R.drawable.firat));
        yorumModelList.add(new YorumModel("Nurdan Albaş","Acıyı seven, arayan ve ona sahip olmak isteyen hiç kimse yoktur. Nedeni basit. Çünkü o acıdır...",R.drawable.nurdan));
        yorumModelList.add(new YorumModel("Tuğba Ay","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...",R.drawable.tugba));
        yorumModelList.add(new YorumModel("Kıvanç Tatlıtuğ","yinelemelerden, mizahtan ve karakteristik olmayan sözcüklerden uzaktır.",R.drawable.kivanc));
        yorumModelList.add(new YorumModel("Adriana Lima","Çiçero tarafından M.Ö. 45 tarihinde kaleme alınan \"de Finibus Bonor",R.drawable.adriana));
        yorumModelList.add(new YorumModel("Scarlett Johansson","Hampden-Sydney College'dan Latince profesörü Richard McClintock,",R.drawable.scarlett));

        yorumAdapter =new YorumAdapter(yorumModelList,getActivity());


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        linearLayoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(yorumAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }
}
