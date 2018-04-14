package com.example.juanpabloghelfi.recyclerviewtest;

/**
 * Created by juanpabloghelfi on 114//18.
 */

public class Computadora {

    private String nombre;

    private String precio;

    public Computadora(String nombre, String precio){

        this.nombre = nombre;

        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }
}
