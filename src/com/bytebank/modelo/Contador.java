package com.bytebank.modelo;

public class Contador extends Funcionario {

    public double getBonificacion() {
        System.out.println("Ejecutando desde contador");
        return 200;
    }

}
