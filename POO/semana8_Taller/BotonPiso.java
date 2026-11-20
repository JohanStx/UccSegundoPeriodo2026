package POO.semana8_Taller;

public class BotonPiso extends Boton {

    private int numeroPiso;      
    private Direccion direccion; 
    private Ascensor ascensor;

    public BotonPiso(boolean iluminado, boolean fallando, int numeroPiso, Direccion direccion, Ascensor ascensor) {
    setIluminado(iluminado);
    setFallando(fallando);
    this.numeroPiso = numeroPiso;
    this.direccion = direccion;
    this.ascensor = ascensor;   // <-- esta línea es la que falta
}   

    @Override
    public void presionar() {
        String msg = "BAJAR";
        if (direccion.estaSubiendo()) {
            msg = "SUBIR";
        }
        if (estaFallando()) {
            System.out.println("  [Piso " + numeroPiso + "] El boton de " + msg + " esta fallando");
        } else if (estaIluminado()) {
            System.out.println("  [Piso " + numeroPiso + "] El boton de " + msg + " ya estaba presionado");
        } else {
            super.presionar();
            System.out.println("  [Piso " + numeroPiso + "] El boton de " + msg + " fue presionado (se ilumina)");
            ascensor.agregarSolicitud(numeroPiso);
        }
    }
}