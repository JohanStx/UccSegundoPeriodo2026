package POO.semana7_Ejercicios;

public class Pedido {

    private Cliente cliente;
    private Producto[] producto;
    private String fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] producto, String fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    @Override
    public String toString() {
        return "Pedido [cliente= " + cliente + ", producto=" + java.util.Arrays.toString(producto) + ", fecha=" + fecha
                + ", numeroTarjetaCredito= " + numeroTarjetaCredito + "]";
    }

    
}
