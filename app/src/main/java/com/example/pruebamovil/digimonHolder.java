package com.example.pruebamovil;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NonNls;

public class digimonHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private ImageView image;
    private TextView level ;

    public digimonHolder(@NonNull View viewItem){
        super(viewItem);
        name= viewItem.findViewById(R.id.name);
        image= viewItem.findViewById(R.id.imageDigimon);
        level= viewItem.findViewById(R.id.level);
    }

    public TextView getNamel(){return name;}
    public ImageView getImg(){return image;}
    public TextView getLevel(){return level;}

}
