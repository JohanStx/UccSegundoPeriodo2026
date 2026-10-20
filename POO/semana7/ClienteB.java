package POO.semana7;

public class ClienteB {
    
    private int identificacion;
    private String nombre;

    public ClienteB(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente [identificacion= " + identificacion + ", nombre= " + nombre + "]";
    }

}
