package com.example.juanpabloghelfi.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Computadora> listaDeComputadoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeComputadoras = new ArrayList<>();


        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));
        this.listaDeComputadoras.add(new Computadora("Lenovo", "30 precio"));

        //Busco el RecyclerView para luego poder setearle el adaptador
        RecyclerView recyclerViewPersonajes = (RecyclerView) findViewById(R.id.recyclerViewMainActivity);

        //Le decios que no va a variar el tamanio de la lista
        recyclerViewPersonajes.setHasFixedSize(true);

        //Le pedimos que muestre las cosas en forma de lista
        recyclerViewPersonajes.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        //Le pedimos que muestre las cosas en forma de grilla
        //recyclerViewPersonajes.setLayoutManager(new GridLayoutManager(this,2));


        //Aca creo el adapter que necesita tener un contexto y una lista de personajes
        //PersonajesAdapter unAdapterDePersonajes = new PersonajesAdapter(this,misPersonajesFavoritos);

        //Creamos el adaptador del recycler
        AdapterComputadora unAdapterDeComputadorasAdapter = new AdapterComputadora(this,listaDeComputadoras);


        //Al listView le seteo el adapter
        //unaViewList.setAdapter(unAdapterDePersonajes);

        //Le damos el adapter al Recycler
        //listViewJuguetes.setAdapter(adaptadorDeJuguetes);
        recyclerViewPersonajes.setAdapter(unAdapterDeComputadorasAdapter);
    }
}
