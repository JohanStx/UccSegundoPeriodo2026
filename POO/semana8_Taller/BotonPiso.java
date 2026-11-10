public class BotonPiso extends Boton {

    private int numeroPiso;
    private Direccion direccion;

    public BotonPiso(boolean iluminado, boolean fallando, int numeroPiso, Direccion direccion) {
        super(iluminado, fallando);
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
    }
    
    public void presionar() {
        if (super.fallando == false) {
            System.out.println("El boton del piso " + numeroPiso + " ha sido presionado");
        } else {
            System.out.println("El boton del piso " + numeroPiso + " esta fallando");
        }
    }
    
}