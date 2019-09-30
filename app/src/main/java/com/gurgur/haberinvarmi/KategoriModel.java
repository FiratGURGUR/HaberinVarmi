package com.gurgur.haberinvarmi;

public class KategoriModel {

    private int KategoriResim;
    private String KategoriBaslik;


    public KategoriModel(int kategoriResim, String kategoriBaslik) {
        KategoriResim = kategoriResim;
        KategoriBaslik = kategoriBaslik;
    }

    public int getKategoriResim() {
        return KategoriResim;
    }

    public void setKategoriResim(int kategoriResim) {
        KategoriResim = kategoriResim;
    }

    public String getKategoriBaslik() {
        return KategoriBaslik;
    }

    public void setKategoriBaslik(String kategoriBaslik) {
        KategoriBaslik = kategoriBaslik;
    }
}
