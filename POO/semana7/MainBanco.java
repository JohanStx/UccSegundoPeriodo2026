package POO.semana7;

public class MainBanco {
    public static void main(String[] args) {
        //Creacion del objeto cuenta
        Cuenta Cuenta1 = new Cuenta("123456", "Juan",0.0);

        //Creacion del objeto cliente
        ClienteB cliente1 = new ClienteB(17789839, "Camilo");

        //Creacion del objeto banco
        Banco banco = new Banco("Banco de Colombia", "Oficina Centenario", Cuenta1);

        System.out.println(banco);

        banco.abrirCuenta(cliente1);
    }
}
