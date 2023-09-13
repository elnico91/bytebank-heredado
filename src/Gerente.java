public class Gerente extends Funcionario implements Autenticable {

    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean iniciarSesion(String clave) {
        return clave.equals("AluraCursosOnLine");
    }

    public double getBonificacion() {
        System.out.println("Ejecutando desde gerente");
        return 2000;
    }

}
