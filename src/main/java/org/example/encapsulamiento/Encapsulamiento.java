package org.example.encapsulamiento;

import org.example.encapsulamiento.excercise06.Persona;
import org.example.encapsulamiento.excercise07.Empleado;
import org.example.encapsulamiento.excersice08.Libro;
import org.example.encapsulamiento.excersice09.Cuenta;
import org.example.encapsulamiento.excersice10.Usuario;

public class Encapsulamiento {
    public static void main(String[] args) {
        Persona persona = new Persona("Mateo Rios", 31);
        persona.setNombre("Mateo Rios Diaz");
        System.out.println(persona.getNombre());

        Empleado empleado = new Empleado(7500000.0);
        empleado.setSalario(8000000.0);
        System.out.println(empleado.getSalario());

        Libro libro = new Libro(10000.0);
        libro.setPrecio(0.0);
        libro.setPrecio(12500.0);
        System.out.println(libro.getPrecio());

        Cuenta cuenta = new Cuenta(100000.0);
        cuenta.retirarSaldo(50000.0);
        cuenta.retirarSaldo(60000.0);
        cuenta.retirarSaldo(50000.00);
        cuenta.retirarSaldo(10000.0);

        Usuario usuario = new Usuario();
        usuario.setNombre("");
    }
}
