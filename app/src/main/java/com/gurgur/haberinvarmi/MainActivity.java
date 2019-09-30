package com.gurgur.haberinvarmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbarF);


        //Burası menu kısmını gosteren kod parcası - baş
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        Fragment fragment = new FragmentNavigationDrawer();
        ((FragmentNavigationDrawer)fragment).setUpNavigationDrawer(drawerLayout,toolbar);
        loadmenu(fragment);
        //Burası menu kısmını gosteren kod parcası - son



        //Sliderı farklı bir frame içinde gösteren fonk.
        loadFragment(new SliderFragment());

        loadDoviz(new Fragment_Doviz());

        loadKategori(new FragmentKategori());

    }


    public void loadmenu(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_content,fragment);
        fragmentTransaction.commit();
    }


    public void loadFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_main,fragment);
        fragmentTransaction.commit();
    }

    public void loadDoviz(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_doviz,fragment);
        fragmentTransaction.commit();
    }


    public void loadKategori(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_kategori,fragment);
        fragmentTransaction.commit();
    }

}
