package POO.semana8_Taller;

public class PuertaAscensor extends Puerta {

    private boolean abierta;

    public void abrirPuerta() {
        if (!abierta) {
            abierta = true;
            System.out.println("la Puerta del ascensor se abre");
        }
    }

    public void cerrarPuerta() {
        if (abierta) {
            if (detectarObstaculo()) {
                mantenerAbierta();
            }
            abierta = false;
            System.out.println("la puerta del ascensor se cierra");
        }
    }
}