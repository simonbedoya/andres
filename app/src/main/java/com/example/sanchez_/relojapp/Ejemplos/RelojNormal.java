package com.example.sanchez_.relojapp.Ejemplos;

import android.content.Context;

import com.example.sanchez_.relojapp.AsynckTask;
import com.example.sanchez_.relojapp.Modelo.Manecilla;
import com.example.sanchez_.relojapp.Modelo.Reloj;
import com.example.sanchez_.relojapp.R;
import com.example.sanchez_.relojapp.abstracto.MainActivity;
import com.example.sanchez_.relojapp.abstracto.Observador;

/**
 * Created by Sanchez.- on 26/11/2016.
 */

public class RelojNormal extends RelojPrincipal{
    MainActivity d;
    Manecilla hora;
    Manecilla min;
    Manecilla seg;
    Manecilla menor;
    AsynckTask asynckTask;

    public RelojNormal(AsynckTask asynckTask){
        this.asynckTask = asynckTask;
    }

    @Override
    protected void crearElementos(){
        hora = new Manecilla(0,24,23,null);
        min = new Manecilla(0,60,59,hora);
        seg = new Manecilla(0,60,50,min);
        relojito = new Reloj(seg);
    }

    @Override
    protected void armarReloj(){
        //d = new MainActivity();

        relojito.addObservador(this.asynckTask);

    }
}
