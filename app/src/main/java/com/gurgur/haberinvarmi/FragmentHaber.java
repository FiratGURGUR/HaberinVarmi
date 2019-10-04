package com.gurgur.haberinvarmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentHaber extends Fragment {
    Button favori_ekle;
    Button geri;
    Button yorumlar;
    private boolean isButtonClicked = false; // You should add a boolean flag to record the button on/off state
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_haber,container,false);

        favori_ekle = view.findViewById(R.id.button4);
        favori_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button4) {
                    isButtonClicked = !isButtonClicked; // toggle the boolean flag
                    view.setBackgroundResource(isButtonClicked ? R.drawable.ic_favori_dolu : R.drawable.ic_favori_bos);
                }
            }
        });


        geri = view.findViewById(R.id.button3);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });


        yorumlar = view.findViewById(R.id.button5);
        yorumlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadHaber(new FragmentYorum());
            }
        });

        return view;
    }


    public void loadHaber(Fragment fragment){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_haber,fragment);
        fragmentTransaction.commit();
    }
}
