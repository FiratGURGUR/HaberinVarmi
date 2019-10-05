package com.gurgur.haberinvarmi;

public class KategoriListModel {

    private int haberResim;
    private String haberBaslik;

    public KategoriListModel(int haberResim, String haberBaslik) {
        this.haberResim = haberResim;
        this.haberBaslik = haberBaslik;
    }


    public int getHaberResim() {
        return haberResim;
    }

    public void setHaberResim(int haberResim) {
        this.haberResim = haberResim;
    }

    public String getHaberBaslik() {
        return haberBaslik;
    }

    public void setHaberBaslik(String haberBaslik) {
        this.haberBaslik = haberBaslik;
    }
}
