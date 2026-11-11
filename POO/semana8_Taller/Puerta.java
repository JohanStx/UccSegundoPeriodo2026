package POO.semana8_Taller;

public class Puerta { 

    private boolean obstaculo;

    public Puerta(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }

    public void detectarObstaculo(boolean obstaculo) {
        if (obstaculo == true) {
            System.out.println("Se ha detectado un obstáculo en la puerta");
        } else {
            System.out.println("No se detectado ningún obstáculo");
        }
    }

    public void mantenerAbierta() {
        if (obstaculo == true) {
            System.out.println("La puerta se mantiene abierta");
        } else {
            System.out.println("La puerta se cierra");
        }
    }
}