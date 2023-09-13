public class Administrador extends Funcionario implements Autenticable {

    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean iniciarSesion(String clave) {
        return clave.equals("AluraCursosOnLine");
    }

//    public double getBonificacion() {
//        System.out.println("Ejecutando desde gerente");
//        return super.getSalario() + (this.getSalario() * 0.5);
//    }

    @Override
    public double getBonificacion() {
        return 0;
    }

}
