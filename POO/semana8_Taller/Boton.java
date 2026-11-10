package POO.semana8_Taller;

public class Boton {
    private boolean iluminado;
    private boolean fallando;

    public Boton(boolean iluminado, boolean fallando) {
        this.iluminado = iluminado;
        this.fallando = fallando;
    }

    public void presionar() {
        if (fallando == false) {
            System.out.println("El boton ha sido presionado");
        } else {
            System.out.println("El boton esta fallando, no se puede presionar");
        }
    }

    public void iluminar() {
        this.iluminado = true;
    }

    public void apagar() {
        this.iluminado = false;
    }

    public void emitirSonido() {
        if (fallando == false) {
            System.out.println("El boton emite sonido");
        } else {
            System.out.println("El boton esta fallando, no puede emitir sonido");
        }
    }
}
