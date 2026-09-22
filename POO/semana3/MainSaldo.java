public class MainSaldo {
    public static void main(String[] args) {
        
        int ingreso = 20000;
        int egreso = 50000;
        

        CuentaBancaria objCuentaBancaria = new CuentaBancaria(100000, "Pepe", 2526, "Corriente", 1234);
        CuentaBancaria objCuentaBancaria2 = new CuentaBancaria(20000, "Utopia", 312624, "ahorros", 8976);

        System.out.println(objCuentaBancaria);
        System.out.println(objCuentaBancaria2);
        System.out.println(objCuentaBancaria.consignacion(ingreso));
        System.out.println(objCuentaBancaria.retiro(egreso));

        ingreso = 5000;
        objCuentaBancaria2.consignacion(ingreso);

        System.out.println(objCuentaBancaria);
        System.out.println(objCuentaBancaria2);

    }
}
