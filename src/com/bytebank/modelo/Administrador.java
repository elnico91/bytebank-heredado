package com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {

    private String clave;
    private AutenticacionUtil util;

    public Administrador() {
        this.util = new AutenticacionUtil();
    }

    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    public Boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

//    public double getBonificacion() {
//        System.out.println("Ejecutando desde gerente");
//        return super.getSalario() + (this.getSalario() * 0.5);
//    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

}
