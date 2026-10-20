package POO.semana7_Ejercicios;

public class MainVenta {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("1094729", "Mortadelo");
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        Foto foto3 = new Foto("foto3.jpg");
        Foto[] fotos = {foto1, foto2, foto3};
        Impresion impresion = new Impresion("Color", fotos, 1);
        Camara camara = new Camara(2, "EOS 5D"," Mark IV");
        Camara camara2 = new Camara(3, "Nikon D850", "FX");
        Producto[] productos = {impresion, camara, camara2};

        Pedido pedido = new Pedido(cliente, productos, "2023-10-01", 123456789);

        System.out.println(pedido);

        Cliente cliente2 = new Cliente("1092463", "Sebastian");
        Foto foto4 = new Foto("foto4.jpg");
        Foto foto5 = new Foto("foto5.jpg");
        Foto[] fotos2 = {foto4, foto5};
        Impresion impresion2 = new Impresion("Blanco y Negro", fotos2, 4);
        Camara camara3 = new Camara(4, "Canon EOS R5", "Full Frame");
        Producto[] productos2 = {impresion2, camara3};

        Pedido pedido2 = new Pedido(cliente2, producto  
            

    }
}
