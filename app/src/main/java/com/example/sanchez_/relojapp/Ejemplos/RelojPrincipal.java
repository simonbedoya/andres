package com.example.sanchez_.relojapp.Ejemplos;

import com.example.sanchez_.relojapp.Modelo.Reloj;

/**
 * Created by Sanchez.- on 26/11/2016.
 */

public class RelojPrincipal {
    protected Reloj relojito;


    public void lanzarReloj(){
        crearElementos();
        armarReloj();
        correr();
    }
    public void correr(){
        relojito.correr();

    }

    //Metodo Hook
    protected  void crearElementos(){};
    //Metodo Hook
    protected  void armarReloj(){};
}
