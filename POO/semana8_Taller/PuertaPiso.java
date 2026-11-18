package POO.semana8_Taller;

public class PuertaPiso extends Puerta {

    private boolean abierta;
    private int numeroPiso;

    public PuertaPiso(boolean obstaculo, boolean abierta, int numeroPiso) {
        super(obstaculo);
        this.abierta = abierta;
        this.numeroPiso = numeroPiso;
    }

    public void abrirPuerta() {
        if (!abierta) {
            abierta = true;
            System.out.println("La puerta del piso se abre.");
        }
    }

    public void cerrarPuerta() {
        if (abierta) {
            if (detectarObstaculo()) {
                mantenerAbierta();
            }
            abierta = false;
            System.out.println("La puerta del piso se cierra.");
        }
    }
}