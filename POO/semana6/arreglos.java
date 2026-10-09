public class Arreglos {
    public static void main(String[] args) {
        //Creacion del arreglo
        int[] a = {6, 5, 9, 1, 8 , 3, 2,};
        
        //recorrer y mostrar el arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a [" + i + "]: " + a[i]);
        }

        //suma de los elementos del arreglo
        int sumaArreglo = 0;
        for (int i = 0; i < a.length; i++) {
            sumaArreglo += a[i];
        }
        System.out.println("La suma del arreglo es: " + sumaArreglo);
    }
}
