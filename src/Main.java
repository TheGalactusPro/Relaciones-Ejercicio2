public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 850.00, "Tecnologia");
        Producto p2 = new Producto("Mouse", 15.50, "Accesorios");
        Producto p3 = new Producto("Teclado", 25.00, "Accesorios");
        Producto p4 = new Producto("Monitor", 180.00, "Tecnologia");
        Catalogo catalogo = new Catalogo();
        catalogo.agregarProducto(p1);
        catalogo.agregarProducto(p2);
        catalogo.agregarProducto(p3);
        catalogo.agregarProducto(p4);
        System.out.println();
        catalogo.listarProductos();
    }
}