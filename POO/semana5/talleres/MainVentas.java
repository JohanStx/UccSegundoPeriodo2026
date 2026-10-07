public class MainVentas {
    public static void main(String[] args) {
        
        Producto obj1 = new Producto(782, "lapiz", 700.0, 30);
        Producto obj2 = new Producto(230, "Borrador", 1500.0, 5);
        Producto obj3 = new Producto(934, "Cuaderno", 5000.0, 17);
        Producto obj4 = new Producto(819, "Lapicero", 1200.0, 22);
        Producto obj5 = new Producto(302, "Sacapuntas", 500.0, 10);
        
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

        System.out.println(obj1.getPrecio());
        System.out.println(obj1.vender(6));

        obj4.vender(2);
        obj2.vender(5);
        System.out.println(obj2.getStock());
        obj2.reabastecer(2);
        

    }
    
}