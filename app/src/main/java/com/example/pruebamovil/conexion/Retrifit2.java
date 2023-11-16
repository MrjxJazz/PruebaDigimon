package com.example.pruebamovil.conexion;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrifit2 {

    public static Retrifit2 instance;

    private Conexionretrofit apiReference;


    Retrifit2() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://digimon-api.vercel.app/api/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        apiReference = retrofit.create(Conexionretrofit.class);
    }

    public static Retrifit2 getInstance(){
    if(instance == null){
        instance = new Retrifit2();
    }
    return instance;
    }

    public Conexionretrofit getApiInterface() {return apiReference;}
}
