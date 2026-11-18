package POO.semana8_Taller;


public class Ascensor {

    private int pisoActual;
    private Direccion direccion;
    private int capacidad;
    private int[] solicitudes;
    private PuertaAscensor puerta;
    private BotonAscensor[] boton;
    private int total;
    private int siguiente; 

    public Ascensor() {
        pisoActual = 1;
        direccion = new Direccion();
        capacidad = 8;
        solicitudes = new int[10];
        puerta = puerta;
        total = 0;
        siguiente = 0;

        boton = new BotonAscensor[5];
    }

    public void mover() {
        if (pisosPendientes()) {
            int destino = solicitudes[siguiente];
            if (destino > pisoActual) {
                if (!direccion.estaSubiendo()) {
                    cambiarDireccion();
                }
                System.out.println("El ascensor sube del piso " + pisoActual + " al piso " + destino);
            } else if (destino < pisoActual) {
                if (direccion.estaSubiendo()) {
                    cambiarDireccion();
                }
                System.out.println("El ascensor baja del piso " + pisoActual + " al piso " + destino);
            } else {
                System.out.println("El ascensor ya esta en el piso " + pisoActual);
            }
            pisoActual = destino;
        }
    }

    public void detener() {
        System.out.println("El ascensor se detiene en el piso " + pisoActual);
    }

    public void cambiarDireccion() {
        direccion.cambiarDireccion();
        System.out.println("El ascensor cambia de direccion " + direccion);
    }

    public void abrirPuerta() {
        puerta.abrirPuerta();
    }

    public void cerrarPuerta() {
        puerta.cerrarPuerta();
    }

    public boolean detectarFalla() {
        return boton[0].estaFallando() || boton[1].estaFallando() || boton[2].estaFallando()
                || boton[3].estaFallando() || boton[4].estaFallando();
    }

    public void agregarSolicitud(int piso) {
        if (piso < 1 || piso > 5) {
            System.out.println("Solicitud invalida, el piso " + piso + " no existe");
        } else if (total == solicitudes.length) {
            System.out.println("La fila de solicitudes esta llena");
        } else {
            solicitudes[total] = piso;
            total++;
            System.out.println("la solicitud fue registrada para el piso " + piso);
        }
    }

    public boolean pisosPendientes() {
        return siguiente < total;
    }

    public void detenerEnPiso(int piso) {
        detener();
        abrirPuerta();
        siguiente++;
        if (boton[piso - 1].estaIluminado()) {
            boton[piso - 1].iluminar();
            System.out.println("Se apaga la luz del boton del piso " + piso);
        }
        System.out.println("Las personas entran y salen");
        cerrarPuerta();
        if (siguiente == total) {
            siguiente = 0;
            total = 0;
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public BotonAscensor getBoton(int piso) {
        return boton[piso - 1];
    }

    public PuertaAscensor getPuerta() {
        return puerta;
    }

    public String toString() {
        return "Ascensor [piso " + pisoActual + ", " + direccion + ", capacidad " + capacidad + " personas]";
    }
}