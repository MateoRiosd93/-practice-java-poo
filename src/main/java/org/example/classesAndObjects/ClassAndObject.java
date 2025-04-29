package org.example.classesAndObjects;

import org.example.classesAndObjects.exercise04.Rectangulo;
import org.example.classesAndObjects.exercise05.CuentaBancaria;
import org.example.classesAndObjects.exercise01.Persona;
import org.example.classesAndObjects.exercise02.Coche;
import org.example.classesAndObjects.exercise03.Producto;

public class ClassAndObject {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Mateo";
        persona.edad = 31;
        persona.printInfoPersona();

        Coche coche = new Coche();
        coche.marca = "Mazda";
        coche.año = 2025;
        coche.modelo = 2024;
        System.out.println(coche.mostrarDatos());

        Producto producto = new Producto();
        producto.nombre = "Play station 5";
        producto.precio = 2500000.0;
        System.out.println("El IVA es: " + producto.getIVA());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.base = 8.0;
        rectangulo.altura = 12.0;
        System.out.println("Area: " + rectangulo.getArea());
        System.out.println("Perimetro: " + rectangulo.getPerimetro());

        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.saldo = 100.0;
        cuentaBancaria.depositarSaldo(100.0);
        cuentaBancaria.retirarSaldo(20.0);
        System.out.println(cuentaBancaria.verSaldo());
    }
}