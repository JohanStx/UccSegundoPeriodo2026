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

    public String toString(){
        return "Cuenta bancaria{ saldo: " + saldo + " titular: " + titular + "numero de cuenta: " + numeroCuenta + " tipo de cuenta: " + tipoCuenta + " Clave: " + clave;
    }
}