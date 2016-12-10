package com.example.sanchez_.relojapp.abstracto;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sanchez_.relojapp.AsynckTask;
import com.example.sanchez_.relojapp.AsynckTask2;
import com.example.sanchez_.relojapp.Ejemplos.RelojNormal;
import com.example.sanchez_.relojapp.Ejemplos.RelojPrincipal;
import com.example.sanchez_.relojapp.Modelo.Reloj;
import com.example.sanchez_.relojapp.R;

public class MainActivity extends AppCompatActivity {
    public TextView lblTimer,lblTimer2;
    private Button Empezar, Empezar2;
    private MainActivity mainactivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainactivity = this;
        lblTimer= (TextView)findViewById(R.id.tClock);
        lblTimer2= (TextView)findViewById(R.id.tClock2);
        Empezar=(Button)findViewById(R.id.Empezar);
        Empezar.setOnClickListener(new Button.OnClickListener(){
                                       @Override
                                       public void onClick(View v) {
                                           AsynckTask async = new AsynckTask(mainactivity);
                                           async.execute();
                                           //RelojPrincipal app = new RelojNormal(mainactivity);
                                           //app.lanzarReloj();
                                       }
        }

        );

        Empezar2=(Button)findViewById(R.id.Empezar2);
        Empezar2.setOnClickListener(new Button.OnClickListener(){
                                       @Override
                                       public void onClick(View v) {
                                           AsynckTask2 async2 = new AsynckTask2(mainactivity);
                                           async2.execute();
                                           //RelojPrincipal app = new RelojNormal(mainactivity);
                                           //app.lanzarReloj();
                                       }
                                   }

        );


    }
    /*@Override
    public void update(Observable o){

        mostrar((Reloj) o);
        lblTimer.setText("sola");

    }

    public void mostrar(final Reloj r){

                    //System.out.println(r.getHora());

        //AQUI ES DONDE LANZA EL ERROR, SEGUN BUSQUE ES UN PROBLEMA DE LOOP...




    }*/
}
