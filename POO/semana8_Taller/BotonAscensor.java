public class BotonAscensor extends Boton {

    private int pisoDestino;

    public BotonAscensor(boolean iluminado, boolean fallando, int pisoDestino) {
        super(iluminado, fallando);
        this.pisoDestino = pisoDestino;
    }

    public void presionar() {
        if (super.fallando == false) {
            System.out.println("El boton del ascensor para el piso " + pisoDestino + " ha sido presionado");
        } else {
            System.out.println("El boton del ascensor para el piso " + pisoDestino + " esta fallando");
        }
    }

}