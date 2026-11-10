public class Puerta { 
    
    private TipoPuerta tipo;
    private boolean obstaculo;
    private EstadoPuerta estado;

    public Puerta(TipoPuerta tipo, boolean obstaculo, EstadoPuerta estado) {
        this.tipo = tipo;
        this.obstaculo = obstaculo;
        this.estado = estado;
    }

    public void abrir() {
        if (obstaculo == false) {
            estado = EstadoPuerta.ABIERTA;
            System.out.println("La puerta se ha abierto");
        } else {
            System.out.println("La puerta no se puede abrir, hay un obstaculo");
        }
    }

    public void cerrar() {
        if (obstaculo == false) {
            estado = EstadoPuerta.CERRADA;
            System.out.println("La puerta se ha cerrado");
        } else {
            System.out.println("La puerta no se puede cerrar, hay un obstaculo");
        }
    }

    public void detectarObstaculo() {
        obstaculo = true;
        System.out.println("Se ha detectado un obstaculo en la puerta");
    }

    public void mantenerAbierta() {
        if (obstaculo == true) {
            estado = EstadoPuerta.ABIERTA;
            System.out.println("La puerta se quedo abierta");
        } else {
            System.out.println("La puerta se cerro, no hay un obstaculo");
        }
    }
    
}