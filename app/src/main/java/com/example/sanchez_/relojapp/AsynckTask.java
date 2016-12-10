package com.example.sanchez_.relojapp;

import android.os.AsyncTask;
import android.util.Log;

import com.example.sanchez_.relojapp.Ejemplos.RelojNormal;
import com.example.sanchez_.relojapp.Ejemplos.RelojPrincipal;
import com.example.sanchez_.relojapp.Modelo.Reloj;
import com.example.sanchez_.relojapp.abstracto.MainActivity;
import com.example.sanchez_.relojapp.abstracto.Observable;
import com.example.sanchez_.relojapp.abstracto.Observador;

/**
 * Created by sbv23 on 10/12/2016.
 */

public class AsynckTask extends AsyncTask<String, String, String> implements Observador {

    MainActivity mainActivity;
    RelojPrincipal app;
    @Override
    protected String doInBackground(String... strings) {
        app.lanzarReloj();
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        app = new RelojNormal(this);

    }

    public AsynckTask() {
    }

    public AsynckTask(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        mainActivity.lblTimer.setText(values[0]);

    }

    @Override
    public void update(Observable o) {

        Log.i("tiempo","llega");
        Reloj re = (Reloj) o;
        publishProgress(re.getHora());
        //mainActivity.lblTimer.setText("hola");
    }
}
