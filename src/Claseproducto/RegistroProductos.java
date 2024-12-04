package Claseproducto;
import java.util.ArrayList;

public class RegistroProductos {
    private ArrayList<Registroproductos2> productos;

    // Constructor que inicializa los productos
    public RegistroProductos() {
        productos = new ArrayList<>();
        // Añadir productos de ejemplo
        productos.add(new Registroproductos2("Laptop", 3800));
        productos.add(new Registroproductos2("Tablet", 1200));
        productos.add(new Registroproductos2("Smartphone", 950));
        productos.add(new Registroproductos2("Auriculares", 50));
        productos.add(new Registroproductos2("SmartWatch", 120));
        productos.add(new Registroproductos2("Minipicadora de Ajos", 40));
        productos.add(new Registroproductos2("Tabla de Picar plegable", 34));
        productos.add(new Registroproductos2("Cortadora de Verduras Multifuncion", 120));
        productos.add(new Registroproductos2("Kit de Viandas de acero", 20));
        productos.add(new Registroproductos2("Friambreras con estuche", 89));
        
    }

    // Método para mostrar el menú
    public void mostrarMenu() {
        System.out.println("                       RALSI IMPORT");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Jr. Jose Olaya 298 Barrio la Florida,Cajamarca // Cel: 959862195");
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("\n------ MENÚ de VENTAS ------");
        System.out.println("1. Ver productos");
        System.out.println("2. Salir");
    }

    // Método para mostrar los productos en una tabla
    public void mostrarProductos() {
        System.out.println("\n-------------- Lista de Productos --------------");
        
        // Mostrando el encabezado de la tabla
        System.out.println("+------------------------------------+---------+");
        System.out.println("| Producto                          | Precio  |");
        System.out.println("+------------------------------------+---------+");
        
        // Mostrando cada producto en una fila de la tabla
        for (Registroproductos2 producto : productos) {
            System.out.printf("| %-34s | %-7.2f |\n", producto.getNombre(), 
                    producto.getPrecio());
        }
        
        // Mostrar la línea final de la tabla
        System.out.println("################################################");
        System.out.println("################################################");
        System.out.println("\n");
    }
}