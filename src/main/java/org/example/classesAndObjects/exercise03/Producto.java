package org.example.classesAndObjects.exercise03;

public class Producto {
    public String nombre;
    public Double precio;
    static final Double IVA = 0.19;

    public Double getIVA(){
        return precio * IVA;
    }
}
