package org.example.encapsulamiento.excercise07;

public class Empleado {
    private Double salario;

    public Empleado(Double salario){
        this.salario = salario;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }
}
