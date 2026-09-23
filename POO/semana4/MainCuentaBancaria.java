public class MainCuentaBancaria {
    public static void main(String[] args) {
        
        
            //new significa instanciar, darle vida a un objeto
        CuentaBancaria objCuentaBancaria = new CuentaBancaria(0.0, "Pepe", "2-526", "Corriente", 1234);

        //Mostrar el objeto en su estado inicial
        System.out.println(objCuentaBancaria);

        //consignando a las cuentas
        System.out.println("Total de saldo: " + objCuentaBancaria.consignacion(2000.0));
        
        //Mostrar el objetos en su estado final
        System.out.println(objCuentaBancaria);

        System.out.println(objCuentaBancaria.retiro(500.0));
        System.out.println(objCuentaBancaria);
        objCuentaBancaria.consularSaldo();
    }
}
