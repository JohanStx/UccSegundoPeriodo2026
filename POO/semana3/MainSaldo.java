public class MainSaldo {
    public static void main(String[] args) {
        
        int ingreso = 20000;
        int egreso = 50000;
        

        CuentaBancaria objCuentaBancaria = new CuentaBancaria(100000, "Pepe", 2526, "Corriente", 1234);

        System.out.println(objCuentaBancaria);
        System.out.println();
        System.out.println(objCuentaBancaria.consignacion(ingreso));
        System.out.println(objCuentaBancaria.retiro(egreso));
        System.out.println(objCuentaBancaria);

    }
}
