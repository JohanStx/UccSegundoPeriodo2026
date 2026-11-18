package POO.semana8_Taller;

public class BotonAscensor extends Boton {

    private int pisoDestino;   
    private Ascensor ascensor;

    public BotonAscensor(boolean iluminado, boolean fallando, int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void presionar() {
        if (estaFallando()) {
            System.out.println("El boton del piso " + pisoDestino + " no responde (esta fallando).");
        } else if (estaIluminado()) {
            System.out.println("El boton del piso " + pisoDestino + " ya estaba presionado.");
        } else {
            super.presionar();
            System.out.println("El boton del piso " + pisoDestino + " presionado (se ilumina).");
            ascensor.agregarSolicitud(pisoDestino);
        }
    }
}