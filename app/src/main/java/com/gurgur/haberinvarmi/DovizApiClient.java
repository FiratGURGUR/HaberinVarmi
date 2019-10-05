package com.gurgur.haberinvarmi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DovizApiClient {

    public static final  String Ana_Url = "https://finans.truncgil.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Ana_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
