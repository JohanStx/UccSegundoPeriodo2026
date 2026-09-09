public class EstudianteUCC {

    //Atributos 
    private int id;
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;

    /*Constructor: el constructor de la clase se reconoce porque
    tiene el mismo nombre de la clase y permite darle vida
    al objeto */
   
    public EstudianteUCC(int id, int cedula, String nombre,
                        String apellido, int edad, double estatura){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura =estatura;

    }

    public String toString(){
        return "EstudianteUCC{ id: " + id + " cedula: " + cedula + " nombre: " + 
                nombre + " apellido: " + apellido + " edad: " + edad + " estatura: " +
                estatura;
    }

}