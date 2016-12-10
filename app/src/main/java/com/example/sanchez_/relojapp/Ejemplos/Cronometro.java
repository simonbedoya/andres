package com.example.sanchez_.relojapp.Ejemplos;

import android.os.AsyncTask;

import com.example.sanchez_.relojapp.AsynckTask;
import com.example.sanchez_.relojapp.Modelo.Manecilla;
import com.example.sanchez_.relojapp.Modelo.Reloj;
import com.example.sanchez_.relojapp.abstracto.MainActivity;
import com.example.sanchez_.relojapp.abstracto.Observador;

/**
 * Created by Sanchez.- on 26/11/2016.
 */

public class Cronometro extends RelojPrincipal {
    AsyncTask d;

    Manecilla seg;
    Manecilla menor;

    public Cronometro(AsynckTask asynckTask){
        this.d = asynckTask;
    }

    @Override
    protected void crearElementos(){

        seg = new Manecilla(0,100,10,null);
        relojito = new Reloj(seg);
    }

    @Override
    protected void armarReloj(){
       // d = new AsynckTask();
        relojito.addObservador((Observador) d);

    }
}
