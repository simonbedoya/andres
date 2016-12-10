package com.example.sanchez_.relojapp.Modelo;

/**
 * Created by Sanchez.- on 26/11/2016.
 */

public class Manecilla {

    private int value;
    private int MAX;
    private int MIN;
    private Manecilla siguiente;

    public Manecilla(){};

    public Manecilla(int min, int max, int initialValue, Manecilla sigItem){
        value = initialValue;
        MAX = max;
        MIN = min;
        siguiente = sigItem;
    }

    public void incrementar(){
        value++;
        if(value == MAX){
            value = MIN;
            if(siguiente!=null)  siguiente.incrementar();
        }
    }
    public String getValue(){
        if (siguiente == null) return ""+value;
        else return siguiente.getValue()+":"+value;
    }
}
