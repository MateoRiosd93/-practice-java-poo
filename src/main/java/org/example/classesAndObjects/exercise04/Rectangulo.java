package org.example.classesAndObjects.exercise04;

public class Rectangulo {
    public Double base;
    public Double altura;

    public Double getArea(){
        return base * altura;
    }

    public Double getPerimetro(){
        return 2 * ( base + altura);
    }
}
