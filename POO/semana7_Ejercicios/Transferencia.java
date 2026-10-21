package POO.semana7_Ejercicios;

public class Transferencia extends Pago {

    public Transferencia(int numeroPago, String hora, double valor) {
        super(numeroPago, hora, valor);
    }

    public void pagar() {
        System.out.println("Pago con transferencia");
    }
}
