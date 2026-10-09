public class MainTrabajador {
    public static void main(String[] args) {
        //Creacion del arreglo trabajadores (arreglo de objetos)
        Trabajador[] t = new Trabajador[3];
        t[0] = new Operario(123456, "Juan", 1000.0, 40.0);
        t[1] = new Vendedor(234567, "Pedro", 2000.0, 10.0);
        t[2] = new Operario(345678, "Maria", 1500.0, 35.0);

        for (int i = 0; i < t.length; i++){
            System.out.println("Salario de: " + t[i].getNombre() + " a pagar es:" + t[i].pagar());
        }

    }
}
