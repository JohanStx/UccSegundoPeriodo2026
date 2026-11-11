package POO.semana8_Taller;

public class Boton {
    private boolean iluminado;
    private boolean fallando;

    public Boton(boolean iluminado, boolean fallando) {
        this.iluminado = iluminado;
        this.fallando = fallando;
    }

    public void presionar() {
        if (fallando == true) {
            System.out.println("El botón está fallando");
        } else {
            System.out.println("El botón ha sido presionado");
        }
    }
    
    public void iluminar() {
        if (iluminado == true) {
            System.out.println("El botón está iluminado");
        } else {
            System.out.println("El botón no está iluminado");
        }
    }
}
