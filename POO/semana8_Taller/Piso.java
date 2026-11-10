public class Piso { 

    private int numero;
    private BotonPiso botonSubida;
    private BotonPiso botonBajada;
    private Puerta puerta;
    private EstadoPuerta estado;

    public Piso(int numero, BotonPiso botonSubida, BotonPiso botonBajada, Puerta puerta, EstadoPuerta estado) {
        this.numero = numero;
        this.botonSubida = botonSubida;
        this.botonBajada = botonBajada;
        this.puerta = puerta;
        this.estado = estado;
    }

    public void solicitarSubida() {
        botonSubida.presionar();
    }

    public void solicitarBajada() {
        botonBajada.presionar();
    }

    public int getNumero() {
        return numero;
    }

    public void getEstadoPuerta() {
        System.out.println("la puerta esta: " + estado);
    }
}