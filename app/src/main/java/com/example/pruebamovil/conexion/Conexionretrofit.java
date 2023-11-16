package com.example.pruebamovil.conexion;


import retrofit2.Call;
import retrofit2.http.GET;

import com.example.pruebamovil.models.digimon;

import java.util.List;

public interface Conexionretrofit {
    @GET("digimon")
    Call<List<digimon>> getdigimon();
}
