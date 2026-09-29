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

    public String consignacion(double valor){
        String msg = "";
        if (valor < 0){
            msg = "No se puede hacer la consignacion";
        }else{
            msg = (saldo = saldo + valor) + "" ;
        }
        return msg;
    }

    public String retiro(double valor){
        String msg = "";
        if (valor > saldo){
            msg = "No se puede hacer el retiro";
        }else{
            msg = (saldo = saldo - valor) + "" ;
        }
        return msg;
    }

    public void consularSaldo(){
        System.out.println("Su saldo actual es: " + saldo);
    }
    

    public String toString(){
        return "Cuenta bancaria{ Saldo: " + saldo + " Titular: " + titular + " Numero de cuenta: " + numeroCuenta + " Tipo de cuenta: " + tipoCuenta + " id: " + id;
    }

}