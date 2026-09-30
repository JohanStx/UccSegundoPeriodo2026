public class Estudiante {

    private String nombre;
    private String documento;
    private int edad;
    private String programa;
    
    //constructor
    public Estudiante(String nombre, String documento, int edad, String programa){
        this.nombre = nombre;
        this. documento = documento;
        this.edad = edad;
        this.programa = programa;
    }
    //Los metodos Getter and setter
    public String getNombre() {
        return nombre;
    }
    //Las cadenas no se pueden comparar con ==
    public void setNombre(String nombre) {
        if (nombre.equals(""))
            System.out.println("El nombre no es valido");
        else
            this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
        else 
            System.out.println("La edad es negativa");
    }

    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String toString() {
        return "Estudiante [ Nombre: " + nombre + " Documento: " + documento + " Edad: " + edad + " Programa: " + programa + " ]";
    }
    
}
