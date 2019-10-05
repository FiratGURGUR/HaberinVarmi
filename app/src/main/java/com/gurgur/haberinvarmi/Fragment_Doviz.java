package com.gurgur.haberinvarmi;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Fragment_Doviz extends Fragment {

    TextView t_dolar;
    TextView t_euro;
    TextView t_altin;
    TextView t_gbp;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_doviz,container,false);

        t_dolar = view.findViewById(R.id.textView4);
        t_euro = view.findViewById(R.id.textView6);
        t_altin = view.findViewById(R.id.textView8);
        t_gbp = view.findViewById(R.id.textView10);

    vericek();


        return view;
    }


    public void vericek(){

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://finans.truncgil.com/")
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        DovizApiInterface client = retrofit.create(DovizApiInterface.class);

        Call<ResponseBody> call = client.OgrencileriAl();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    JSONObject jsonObject =new JSONObject(response.body().string());


                    String dolar = jsonObject.getString("ABD DOLARI");
                    JSONObject Amerikandolar = new JSONObject(dolar);
                    String dolarAlis = Amerikandolar.getString("Alış");
                    String dolarSatis = Amerikandolar.getString("Satış");


                    String euro = jsonObject.getString("EURO");
                    JSONObject europara = new JSONObject(euro);
                    String euroAlis = europara.getString("Alış");
                    String euroSatis = europara.getString("Satış");


                    String altin = jsonObject.getString("Gram Altın");
                    JSONObject altinceyrek = new JSONObject(altin);
                    String altinAlis = altinceyrek.getString("Alış");
                    String altinSatis = altinceyrek.getString("Satış");


                    String sterlin = jsonObject.getString("İNGİLİZ STERLİNİ");
                    JSONObject sterlinpara = new JSONObject(sterlin);
                    String sterlinAlis = sterlinpara.getString("Alış");
                    String sterlinSatis = sterlinpara.getString("Satış");


                    t_dolar.setText(dolarSatis);
                    t_euro.setText(euroSatis);
                    t_altin.setText(altinSatis);
                    t_gbp.setText(sterlinSatis);


                    Log.i("firat" , "DOLAR : "+ dolar + " Satış : " + dolarSatis);
                    Log.i("firat" , "EURO : "+ euro + " Satış : " + euroSatis);
                    Log.i("firat" , "Gram Altın : "+ altin + " Satış : " + altinSatis);
                    Log.i("firat" , "İNGİLİZ STERLİNİ : "+ sterlin + " Satış : " + sterlinSatis);



                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i("firat" , t.toString());
            }
        });

    }

}
