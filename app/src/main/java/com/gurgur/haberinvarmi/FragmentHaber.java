package com.gurgur.haberinvarmi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHaber extends Fragment {
    Button favori_ekle;
    Button geri;
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



        return view;
    }
}
