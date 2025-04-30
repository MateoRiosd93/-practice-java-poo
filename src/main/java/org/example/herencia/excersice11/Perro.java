package org.example.herencia.excersice11;

public class Perro extends Animal {
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro " + nombre + " hace el sonido Guaaau!!!" );
    }
}
