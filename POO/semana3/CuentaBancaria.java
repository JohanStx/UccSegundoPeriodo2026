public class CuentaBancaria {

    //Atributos de la clase CuentaBancaria
    private int saldo;
    private String titular;
    private int numeroCuenta;
    private String tipoCuenta;
    private int clave;

    public CuentaBancaria(int saldo, String titular, int numeroCuenta, String tipoCuenta, int clave ){

        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.clave = clave;
    }

    public int consignacion(int ingreso){
        saldo = saldo + ingreso;
        return saldo;
    }


    public int retiro(int egreso){
        saldo = saldo - egreso;
        return saldo;
    }

    public String toString(){
        return "Cuenta bancaria{ Saldo: " + saldo + " Titular: " + titular + " Numero de cuenta: " + numeroCuenta + " Tipo de cuenta: " + tipoCuenta + " Clave: " + clave;
    }

}