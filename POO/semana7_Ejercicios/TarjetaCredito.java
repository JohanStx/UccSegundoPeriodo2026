package POO.semana7_Ejercicios;

public class TarjetaCredito extends Pago {
    
    public TarjetaCredito(int numeroPago, String hora, double valor) {
        super(numeroPago, hora, valor);
    }

    public void pagar() {
        System.out.println("Pago con tarjeta de credito");
    }
}

