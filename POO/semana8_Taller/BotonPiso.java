package POO.semana8_Taller;

public class BotonPiso extends Boton { 
    private int numeroPiso;
    private Direccion direccion;

    public BotonPiso(int numeroPiso, Direccion direccion, boolean iluminado, boolean fallando) {
        super(iluminado, fallando);
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
    }

    public void presionar() {
        
    }
}