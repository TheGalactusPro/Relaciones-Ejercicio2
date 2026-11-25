import java.util.ArrayList;
public class Catalogo {
    private ArrayList<Producto> productos;
    public Catalogo() {
        productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El catalogo esta vacio.");
        } else {
            System.out.println("=== LISTA DE PRODUCTOS ===");
            for (Producto producto : productos) {
                System.out.println("--------------------");
                System.out.println(producto.mostrarInformacion());
            }
        }
    }
}