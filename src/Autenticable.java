public abstract interface Autenticable {

    public abstract void setClave(String clave);

    public abstract Boolean iniciarSesion(String clave);

}
