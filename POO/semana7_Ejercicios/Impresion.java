package POO.semana7_Ejercicios;

public class Impresion extends Producto{

    private String color;
    private Foto[] fotos;

    public Impresion(String color, Foto[] fotos, int numero) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    @Override
    public String toString() {
        return "Impresion [color= " + color + ", fotos= " + java.util.Arrays.toString(fotos) + "]";
    }
}
