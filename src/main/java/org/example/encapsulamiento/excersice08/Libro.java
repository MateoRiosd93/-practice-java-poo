package org.example.encapsulamiento.excersice08;

public class Libro {
    private Double precio;

    public Libro(Double precio){
        this.precio = precio;
    }

    public Double getPrecio(){
        return precio;
    }

    public void setPrecio(Double precio){
        if(precio <= 0){
            System.out.println("El precio no puede ser menor ni igual a cero!!!");
            return;
        }

        this.precio = precio;
    }
}
