package com.example.pruebamovil.models;

import com.google.gson.annotations.SerializedName;

import kotlin.jvm.internal.SerializedIr;

public class digimon {

    public String getName() {
        return name;
    }


    private String name;

    public String getImg() {
        return img;
    }

    @SerializedName("img")
    private String img;

    public String getLevel() {
        return level;
    }

    private String level;

}
