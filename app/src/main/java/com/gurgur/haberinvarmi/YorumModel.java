package com.gurgur.haberinvarmi;

public class YorumModel {

    private String userName;
    private String yorum;
    private int userPhotoUrl;

    public YorumModel(String userName, String yorum, int userPhotoUrl) {
        this.userName = userName;
        this.yorum = yorum;
        this.userPhotoUrl = userPhotoUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public int getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public void setUserPhotoUrl(int userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
    }
}
