package POO.semana7_Ejercicios;

public class Foto {
    private  String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    @Override
    public String toString() {
        return "Foto [fichero= " + fichero + "]";
    }

    
}
