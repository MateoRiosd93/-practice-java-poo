package org.example.encapsulamiento.excersice09;

public class Cuenta {
    private Double saldo;

    public Cuenta(Double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public Double retirarSaldo(Double cantidad){
        if(saldo == 0){
            System.out.println("Saldo insuficiente!!!");
            return 0.0;
        }

        if(cantidad > saldo){
            System.out.println("La cantidad que desea retirar es mayor al saldo " + saldo);
            return 0.0;
        }

        saldo -= cantidad;
        System.out.println("Saldo en cuenta luego del retiro " + saldo);
        return cantidad;
    }
}
