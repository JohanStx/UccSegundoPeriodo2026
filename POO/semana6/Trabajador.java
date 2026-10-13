public class Trabajador {
    //Atributos
    private int cedula;
    private String nombre;
    private double salario;

    public Trabajador(int cedula, String nombre, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getCedula() {
        return cedula;
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    
    public double pagar (){
        return salario * 1.10;
    }
}