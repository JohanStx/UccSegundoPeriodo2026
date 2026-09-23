public class MainCuentaBancaria {
    public static void main(String[] args) {
        
        
            //new significa instanciar, darle vida a un objeto
        CuentaBancaria objCuentaBancaria = new CuentaBancaria(0.0, "Pepe", "2-526", "Corriente", 1234);
        CuentaBancaria objCuentaBancaria2 = new CuentaBancaria(0.0, "Utopia", "312-624", "ahorros", 8976);

        //Mostrar el objeto en su estado inicial
        System.out.println(objCuentaBancaria);
        System.out.println(objCuentaBancaria2);

        //consignando a las cuentas
        System.out.println("Total de saldo: " + objCuentaBancaria.consignacion(1000.0));
        System.out.println("Total de saldo: " + objCuentaBancaria2.consignacion(5000.0));
        //Mostrar el objetos en su estado final
        System.out.println(objCuentaBancaria);
        System.out.println(objCuentaBancaria2);

    }
}
