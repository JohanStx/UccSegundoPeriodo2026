package POO.semana8_Taller;

public class Piso {

    private int numero;
    private BotonPiso botonSubida;
    private BotonPiso botonBajada;
    private PuertaPiso puerta;

    public Piso(int numero) {
        this.numero = numero;
        this.botonSubida = new BotonPiso(false, false, numero, null);
        this.botonBajada = new BotonPiso(false, false, numero, null);;
        this.puerta = new PuertaPiso(false, false, numero);
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