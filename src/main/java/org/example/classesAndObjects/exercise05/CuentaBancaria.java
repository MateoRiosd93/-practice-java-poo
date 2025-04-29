package org.example.classesAndObjects.exercise05;

public class CuentaBancaria {
    public Double saldo;

    public void depositarSaldo(Double saldo){
        this.saldo += saldo;
    }

    public void retirarSaldo(Double saldo){
        this.saldo -= saldo;
    }

    public Double verSaldo(){
        return saldo;
    }
}
