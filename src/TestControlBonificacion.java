public class TestControlBonificacion {

    public static void main(String[] args) {
        Funcionario diego = new Funcionario() {
            @Override
            public double getBonificacion() {
                return 0;
            }
        };
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexis);
    }

}
