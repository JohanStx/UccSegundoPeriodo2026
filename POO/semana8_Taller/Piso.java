package POO.semana8_Taller;

public class Piso {

    private int numero;
    private BotonPiso botonSubida;
    private BotonPiso botonBajada;
    private PuertaPiso puerta;

    public Piso(int numero, Ascensor ascensor) {
        this.numero = numero;
        this.botonSubida = new BotonPiso(numero, new Direccion(true), ascensor);
        this.botonBajada = new BotonPiso(numero, new Direccion(false), ascensor);
        this.puerta = new PuertaPiso();
    }

    public void solicitarSubida() {
        System.out.println("En el piso " + numero + " alguien llama el ascensor para subir");
        botonSubida.presionar();
    }

    public void solicitarBajada() {
        System.out.println("En el piso " + numero + " alguien llama el ascensor para bajar");
        botonBajada.presionar();
    }

    public int getNumero() {
        return numero;
    }

    public BotonPiso getBotonSubida() {
        return botonSubida;
    }

    public void ascensorLlego() {
        System.out.println("En el piso " + numero + " llego el ascensor.");
        if (botonSubida.estaIluminado()) {
            botonSubida.iluminar();
        }
        if (botonBajada.estaIluminado()) {
            botonBajada.iluminar();
        }
        puerta.abrirPuerta();
    }

    public void ascensorSeVa() {
        puerta.cerrarPuerta();
    }
}