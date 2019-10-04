package com.gurgur.haberinvarmi;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

public class FragmentNavigationDrawer extends Fragment implements View.OnClickListener {

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;

    LinearLayout menu_anasayfa;
    LinearLayout menu_sondakika;
    LinearLayout menu_spor;
    LinearLayout menu_finans;
    LinearLayout menu_magazin;
    LinearLayout menu_teknoloji;
    LinearLayout menu_ayarlar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.drawermenu,container,false);


        menu_anasayfa = view.findViewById(R.id.anasayfa);
        menu_sondakika = view.findViewById(R.id.sondakika);
        menu_spor = view.findViewById(R.id.spor);
        menu_finans = view.findViewById(R.id.finans);
        menu_magazin = view.findViewById(R.id.magazin);
        menu_teknoloji = view.findViewById(R.id.teknoloji);
        menu_ayarlar = view.findViewById(R.id.ayarlar);

        menu_anasayfa.setOnClickListener(this);
        menu_sondakika.setOnClickListener(this);
        menu_spor.setOnClickListener(this);
        menu_finans.setOnClickListener(this);
        menu_magazin.setOnClickListener(this);
        menu_teknoloji.setOnClickListener(this);
        menu_ayarlar.setOnClickListener(this);


        return view;
    }


    public void setUpNavigationDrawer(DrawerLayout drawerLayout, Toolbar toolbar){
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(),mDrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        mDrawerToggle.getDrawerArrowDrawable().setColor(Color.WHITE);

        mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
                mDrawerToggle.onDrawerSlide(drawerView,slideOffset);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.anasayfa:
                break;
            case R.id.sondakika:
                break;
            case R.id.spor:
                break;
            case R.id.finans:
                break;
            case R.id.magazin:
                break;
            case R.id.teknoloji:
                break;
            case R.id.ayarlar:
                break;

             default:
                 break;
        }
    }
}
