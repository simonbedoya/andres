package com.example.sanchez_.relojapp.Modelo;

import android.content.Context;

import com.example.sanchez_.relojapp.abstracto.Observable;

/**
 * Created by Sanchez.- on 26/11/2016.
 */

public class Reloj extends Observable{

    Manecilla menor;
    Context context;

    public Reloj(Manecilla menor){
        this.menor = menor;
        this.context = context;

    }
    public void correr(){



        while(true)
        {
            menor.incrementar();
            try{
                Thread.sleep(1000);

            }
            catch(Exception e){}

            this.notificarObservadores();
        }



    }

    public String getHora(){return menor.getValue();}
}
