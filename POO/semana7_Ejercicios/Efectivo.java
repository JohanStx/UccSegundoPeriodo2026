package POO.semana7_Ejercicios;

public class Efectivo extends Pago{

    public Efectivo(int numeroPago, String hora, double valor) {
        super(numeroPago, hora, valor);
    }

    public void pagar() {
        System.out.println("Pago con efectivo");
    }
}
