public class CuentaBancaria {

    //Atributos de la clase CuentaBancaria
    private double saldo;
    private String titular;
    private String numeroCuenta;
    private String tipoCuenta;
    private int id;

    public CuentaBancaria(double saldo, String titular, String numeroCuenta, String tipoCuenta, int id ){

        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.id = id;
        
    }

    public double consignacion(double ingreso){
        saldo = saldo + ingreso;
        return saldo ;
    }

    public double retiro(double egreso){
        saldo = saldo - egreso;
        return saldo;
    }

    public String toString(){
        return "Cuenta bancaria{ Saldo: " + saldo + " Titular: " + titular + " Numero de cuenta: " + numeroCuenta + " Tipo de cuenta: " + tipoCuenta + " id: " + id;
    }

}