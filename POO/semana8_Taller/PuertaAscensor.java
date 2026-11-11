package POO.semana8_Taller;

public class PuertaAscensor extends Puerta { 

    public PuertaAscensor(boolean obstaculo) {
        super(obstaculo);
    }

    public void abrirPuerta() {
        System.out.println("La puerta del ascensor se abre");
    }
    public void cerrarPuerta() {
        System.out.println("La puerta del ascensor se cierra");
    }
}