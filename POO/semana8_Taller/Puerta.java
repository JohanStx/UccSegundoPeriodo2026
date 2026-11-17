package POO.semana8_Taller;

/**
 * Puerta: clase PADRE de las puertas. Lo que tienen en común es el obstáculo.
 */
public class Puerta {

    private boolean obstaculo; 

    public Puerta(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }

    public boolean detectarObstaculo() {
        return obstaculo;
    }

    public void mantenerAbierta() {
        System.out.println("Se detecto un obstaculo la puerta se mantiene abierta");
        obstaculo = false;
        System.out.println("No se detecto obstaculo");
    }

    public void setObstaculo(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }
}