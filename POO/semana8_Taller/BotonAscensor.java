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
        System.out.println("Se ha presionado el botón del piso " + numeroPiso);
        if (Direccion == Direccion.subir()) {
            System.out.println("El ascensor subirá al piso " + numeroPiso);
            } else (Direccion == Direccion.bajar()) {
            System.out.println("El ascensor bajará al piso " + numeroPiso);
        }
    }
}