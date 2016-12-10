package com.example.sanchez_.relojapp.abstracto;

import android.content.Context;

/**
 * Created by Sanchez.- on 26/11/2016.
 */

public class Observable {
    java.util.LinkedList<Observador> observadores;

    public void addObservador(Observador obs){
        if(observadores == null) observadores = new java.util.LinkedList<Observador>();
        observadores.add(obs);
    }

    public void notificarObservadores(){
        for(java.util.Iterator<Observador> e = observadores.iterator(); e.hasNext(); ){
            e.next().update(this);

        }
    }
}
