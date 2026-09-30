public class MainEstudiante {
    public static void main(String[] args) {
        //Crear el objeto de la clase estudiante
        Estudiante objEstudiante = new Estudiante("Raul", "1097283", 23, "ingenieria de sistemas");
        Estudiante objEstudiante2 = new Estudiante("Maria", "10872398", 27, "ingenieria industrial");
        Estudiante objEstudiante3 = new Estudiante("Rodolfo", "1789023", 18, "ingenieria mecanica");

        //Mostrar la informacion de los objetos
        System.out.println(objEstudiante);
        System.out.println(objEstudiante2);
        System.out.println(objEstudiante3);

        //uso de los metodos get y set
        System.out.println(objEstudiante.getEdad());//23
        System.out.println(objEstudiante2.getEdad());//27

        //Cambiar el nombre del objeto "objEstudiante2"
        objEstudiante2.setNombre("Maria Antonieta");
        
        //Cambiar el programa del objeto "objEstudiante2"
        objEstudiante2.setPrograma("ingenieria de sistemas");
        System.out.println(objEstudiante2); /*Estudiante [ Nombre: Maria Antonieta Documento: 10872398 Edad: 27 Programa: ingenieria de sistemas ] */
        
        //Validar con el metodo setEdad que la edad sea mayor o igual a 0
        objEstudiante.setEdad(30);//
        System.out.println(objEstudiante);
        objEstudiante.setEdad(-30);//La edad es negativa
        
        //Validar con el metodo setNombre que el nombre no este vacio
        objEstudiante3.setNombre("Rodolfo Alfonso");
        System.out.println(objEstudiante3);
        objEstudiante3.setNombre("");   

    }
}
