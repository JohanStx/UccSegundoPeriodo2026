package POO.semana7_Ejercicios;

public class Pago {

    private int numeroPago;
    private String hora;
    private double valor;

    public Pago(int numeroPago, String hora, double valor) {
        this.numeroPago = numeroPago;
        this.hora = hora;
        this.valor = valor;
    } 

    

    public void pagar() {

    }

    @Override
    public String toString() {
        return "Pago [numeroPago=" + numeroPago + ", hora=" + hora + ", valor=" + valor + "]";
    }
    

}
