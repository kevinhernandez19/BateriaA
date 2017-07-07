package com.kevin;

/**
 * Created by alumno on 5/07/2017.
 */
public class Tienda {

    private String nombre_gerente;
    private String direccion;
    private int año_creacion;


    public String getNombre_gerente() {
        return nombre_gerente;
    }

    public void setNombre_gerente(String nombre_gerente) {
        this.nombre_gerente = nombre_gerente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAño_creacion() {
        return año_creacion;
    }

    public void setAño_creacion(int año_creacion) {
        this.año_creacion = año_creacion;
    }

    public Tienda(String nombre_gerente, String direccion, int año_creacion) {
        this.nombre_gerente = nombre_gerente;
        this.direccion = direccion;
        this.año_creacion = año_creacion;



    }

}
