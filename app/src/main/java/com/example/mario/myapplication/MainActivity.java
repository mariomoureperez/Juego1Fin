package com.example.mario.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.Start);
        Button boton0 = (Button) findViewById(R.id.boton0);
        Button boton1 = (Button) findViewById(R.id.boton1);
        Button boton2 = (Button) findViewById(R.id.boton2);
        Button boton3 = (Button) findViewById(R.id.boton3);
        Button boton4 = (Button) findViewById(R.id.boton4);
        Button boton5 = (Button) findViewById(R.id.boton5);
        Button boton6 = (Button) findViewById(R.id.boton6);
        Button boton7 = (Button) findViewById(R.id.boton7);
        Button boton8 = (Button) findViewById(R.id.boton8);
        Button botonV = (Button) findViewById(R.id.botonV);

    }
    ArrayList almacen= new ArrayList();
    ArrayList respuesta=new ArrayList();


    void eventoStart(View s){
        aleatorio();
        Toast.makeText(getApplicationContext(),almacen.toString(), Toast.LENGTH_SHORT).show();

        Button boton0 = (Button) findViewById(R.id.boton0);
        Button boton1 = (Button) findViewById(R.id.boton1);
        Button boton2 = (Button) findViewById(R.id.boton2);
        Button boton3 = (Button) findViewById(R.id.boton3);
        Button boton4 = (Button) findViewById(R.id.boton4);
        Button boton5 = (Button) findViewById(R.id.boton5);
        Button boton6 = (Button) findViewById(R.id.boton6);
        Button boton7 = (Button) findViewById(R.id.boton7);
        Button boton8 = (Button) findViewById(R.id.boton8);
        boton0.setBackgroundColor(Color.WHITE);
        boton1.setBackgroundColor(Color.WHITE);
        boton2.setBackgroundColor(Color.WHITE);
        boton3.setBackgroundColor(Color.WHITE);
        boton4.setBackgroundColor(Color.WHITE);
        boton5.setBackgroundColor(Color.WHITE);
        boton6.setBackgroundColor(Color.WHITE);
        boton7.setBackgroundColor(Color.WHITE);
        boton8.setBackgroundColor(Color.WHITE);
        boton0.setEnabled(true);
        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton4.setEnabled(true);
        boton5.setEnabled(true);
        boton6.setEnabled(true);
        boton7.setEnabled(true);
        boton8.setEnabled(true);

    }


    void evento0(View a){
        respuesta.add(((Button)a).getText());
        ((Button)a).setBackgroundColor(Color.DKGRAY);
        ((Button)a).setEnabled(false);
            }
    void evento1(View b){
        respuesta.add(((Button)b).getText());
        ((Button)b).setBackgroundColor(Color.DKGRAY);
        ((Button)b).setEnabled(false);
    }
    void evento2(View c){
        respuesta.add(((Button)c).getText());
        ((Button)c).setBackgroundColor(Color.DKGRAY);
        ((Button)c).setEnabled(false);
    }
    void evento3(View d){
        respuesta.add(((Button)d).getText());
        ((Button)d).setBackgroundColor(Color.DKGRAY);
        ((Button)d).setEnabled(false);
    }
    void evento4(View e){
        respuesta.add(((Button)e).getText());
        ((Button)e).setBackgroundColor(Color.DKGRAY);
        ((Button)e).setEnabled(false);
    }
    void evento5(View f){
        respuesta.add(((Button)f).getText());
        ((Button)f).setBackgroundColor(Color.DKGRAY);
        ((Button)f).setEnabled(false);
    }
    void evento6(View g){
        respuesta.add(((Button)g).getText());
        ((Button)g).setBackgroundColor(Color.DKGRAY);
        ((Button)g).setEnabled(false);
    }
    void evento7(View h){
        respuesta.add(((Button)h).getText());
        ((Button)h).setBackgroundColor(Color.DKGRAY);
        ((Button)h).setEnabled(false);
    }
    void evento8(View i){
        respuesta.add(((Button)i).getText());
        ((Button)i).setBackgroundColor(Color.DKGRAY);
        ((Button)i).setEnabled(false);
    }
    void eventoComprobar(View j){
        String x=almacen.toString();
        String y=respuesta.toString();
    if(x.equals(y)){
        Toast.makeText(getApplicationContext(),"Has Ganado", Toast.LENGTH_SHORT).show();

    }else {
        Toast.makeText(getApplicationContext(), "Has Perdido", Toast.LENGTH_SHORT).show();
    }

        respuesta.clear();
        almacen.clear();




    }
    public void aleatorio(){
        for ( int i=0 ; i<8; i++){
            int valorDado = (int) Math.floor(Math.random()*9);
            while(almacen.contains(valorDado)){
                valorDado=(int)Math.floor(Math.random()*9);
            }
            almacen.add(valorDado);
          }

    }


}
