public class EjecutarVehiculos {
    public static void main(String[] args) {
        
        //creacion del objeto vehiculo

        Vehiculo objVehiculo1 = new Vehiculo(2025, "renault", "gris", 950.5, "stepway");
        Vehiculo objVehiculo2 = new Vehiculo(1954, "Hudson", "Azul rey", 1800, "Hornet");

        System.out.println(objVehiculo1);
        System.out.println(objVehiculo2);

        System.out.println(objVehiculo1.calcularAntiguedadVehiculo(2026));
        System.out.println(objVehiculo2.calcularAntiguedadVehiculo(2026));


    }

}
