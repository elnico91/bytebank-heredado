package com.bytebank.modelo;

public interface Autenticable {

    public void setClave(String clave);

    public Boolean iniciarSesion(String clave);

}
