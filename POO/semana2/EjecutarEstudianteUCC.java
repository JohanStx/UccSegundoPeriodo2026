public class EjecutarEstudianteUCC {
    public static void main(String[] args) {
        
        /*Creacion del objeto objEstudiante1 que se crea a partir
        de la clase EstudianteUCC */

        EstudianteUCC objEstudiante1 = new EstudianteUCC(987161, 11170220, "Sofia", "Pichimata", 15, 1.60);
        EstudianteUCC objEstudiante2 = new EstudianteUCC(123456, 10618964, "Aldair", "Peña", 80, 1.75);


        System.out.println(objEstudiante1); //mostrar la informacion que tiene el objeto "objEstudiante1"
        System.out.println(objEstudiante2); //mostrar la informacion que tiene el objeto "objEstudiante2"

        //promedio de las edades de los estudiantes
    }
}
