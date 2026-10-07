public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, double precio, int stock){
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String vender(int cantidad){
        String msg = "";
        if (cantidad <= stock){
            return (stock = stock - cantidad) + "";
        }else{
            msg = "La cantidad solicitada no esta disponible";
        }
        return msg;
    }
    public int reabastecer(int cantidad){
        return stock = (stock + cantidad);
    }

    public String CalcularValorInventario(){
        return "El valor del stock total del producto '"+ nombre + "' es de " +(precio * stock) ;
    }
    public String toString() {
        return "Producto [ Codigo: "+ codigo + " Nombre: "+ nombre + " Precio: "+ precio + " Stock: "+ stock + "]";
    }
    
}

    class ventas extends Producto{

        private int cantidad;
        private String producto;

        public ventas(int codigo, String nombre, double precio, int stock, int cantidad, String producto){
                        
            super(codigo, nombre, precio, stock);
            this.cantidad = cantidad;
            this.producto = producto;

        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
            setStock(getStock() - cantidad);
        }

        public String getProducto() {
            return producto;
        }

        public void setProducto(String producto) {
            this.producto = producto;
        }

        public String toString() {
            return "se vendieron " + cantidad + " unidades del producto " + producto;
        }

    }