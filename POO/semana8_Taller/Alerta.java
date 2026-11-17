package POO.semana8_Taller;

import java.util.Date;

public class Alerta {

    private String mensaje;    
    private String componente;
    private Date fecha;

    public Alerta(String mensaje, String componente, Date fecha) {
        this.mensaje = mensaje;
        this.componente = componente;
        this.fecha = fecha;
    }
    
    public void mostrar() {
        System.out.println("[ALERTA] " + fecha + " | Componente: " + componente + " | " + mensaje);
    }
}