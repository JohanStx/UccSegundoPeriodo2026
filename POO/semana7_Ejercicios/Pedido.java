package POO.semana7_Ejercicios;

public class Pedido {

    private Cliente cliente;
    private Producto[] producto;
    private String fecha;
    private Pago pago;


    public Pedido(Cliente cliente, Producto[] producto, String fecha, Pago pago) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.pago = pago;
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Productos: ");
        for (int i = 0; i < producto.length; i++) {
            System.out.println(" - " + producto[i]);
        }
        System.out.println("Fecha: " + fecha);
        pago.pagar();
        System.out.println("Pago:" + pago);
        
    }

    public void mostrarPago() {

    }


    @Override
    public String toString() {
        return "Pedido [cliente= " + cliente + ", producto=" + java.util.Arrays.toString(producto) + ", fecha=" + fecha
                + ", pago= " + pago + "]";
    }

    
}
