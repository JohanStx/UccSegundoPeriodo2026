package POO.semana8_Taller;

public class Boton {

    private boolean iluminado;
    private boolean fallando;  
    
    public Boton() {
        this.iluminado = false;
        this.fallando = false;
    }

    public void presionar() {
        if (fallando == false && iluminado == false) {
            iluminar();
        }
    }

    //enciende o apaga la luz del botón
    public void iluminar() {
        iluminado = !iluminado;
    }

    public boolean estaIluminado() {
        return iluminado;
    }

    public boolean estaFallando() {
        return fallando;
    }

    public void setFallando(boolean fallando) {
        this.fallando = fallando;
    }

    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }
}