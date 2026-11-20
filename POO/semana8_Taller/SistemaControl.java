package POO.semana8_Taller;

import java.util.Date;

public class SistemaControl {

    private Ascensor ascensor;
    private Piso[] pisos;
    private Alerta[] alertas;
    private Date horaInicio;
    private int cantidadAlertas;
    private boolean fallaAvisada;

    public SistemaControl() {
        horaInicio = new Date();
        ascensor = new Ascensor();
        alertas = new Alerta[10];
        cantidadAlertas = 0;
        fallaAvisada = false;
        pisos = new Piso[5];

        for (int i = 0; i < pisos.length ; i++) {
            pisos[i] = new Piso(i + 1, ascensor);
        }
        
    }

    public void procesarSoliciudes() {
        if (ascensor.detectarFalla() && !fallaAvisada) {
            enviarAlerta(new Alerta("Un boton del ascensor esta fallando", "BotonAscensor", new Date()));
            fallaAvisada = true;
        }
        if (ascensor.pisosPendientes()) {
            ascensor.mover();
            int piso = ascensor.getPisoActual();
            pisos[piso - 1].ascensorLlego();
            ascensor.detenerEnPiso(piso);
            pisos[piso - 1].ascensorSeVa();
            registrarActividad();
        } else {
            System.out.println("No hay solicitudes pendientes.");
        }
    }

    
    public void enviarAlerta(Alerta a) {
        if (cantidadAlertas < alertas.length) {
            alertas[cantidadAlertas] = a;
            cantidadAlertas++;
        }
        a.mostrar();
    }

    public void registrarActividad() {
        System.out.println("[REGISTRO] Piso actual: " + ascensor.getPisoActual()
                + " | Alertas: " + cantidadAlertas
                + " | Sistema encendido desde: " + horaInicio);
    }

    public Ascensor getAscensor() {
        return ascensor;
    }

    public Piso getPiso(int numero) {
        return pisos[numero - 1];
    }
}