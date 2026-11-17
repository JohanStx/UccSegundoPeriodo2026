package POO.semana8_Taller;

public class Direccion {

    private boolean subiendo;

    public Direccion(boolean subiendo) {
        this.subiendo = subiendo;
    }

    private boolean Subir() {
        return subiendo;
    }

    private boolean Bajar() {
        return !subiendo;
    }

    public boolean estaSubiendo() {
        return Subir();
    }

    public void cambiarDireccion() {
        subiendo = !subiendo;
    }

    public String toString() {
        if (Bajar()) {
            return "BAJANDO";
        }
        return "SUBIENDO";
    }
}