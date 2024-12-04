package Claseventa;
import java.util.Scanner;
public class Programaventa {
    //Declarando variables
    String nombreProducto;
    int cantidad;
    double precioUnitario,subtotal,igv,precioTotal;

    // Método para mostrar el menú
    public void mostrarMenu() {
        System.out.println("A punto de pertenecer a la Familia RALSI IMPORT");
        System.out.println("\n-----------------------------------------------");
        System.out.println("\n#########- MENÚ DE VENTAS -#########");
        System.out.println("\n");
        System.out.println("1. Realizar una venta");
        System.out.println("2. Salir");
        System.out.println("\n");
        
    }

    // Método para realizar la venta, ingresando el nombre del producto, cantidad y cálculo
    public void realizarVenta(Scanner scanner) {
        // Solicitar datos del producto
        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = scanner.nextLine();

        System.out.print("Ingrese la cantidad a vender: ");
        cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio unitario del producto: ");
        precioUnitario = scanner.nextDouble();

        // Calcular el subtotal, IGV y precio total
        subtotal = cantidad * precioUnitario;
        igv = subtotal * 0.18; // 18% de IGV
        precioTotal = subtotal + igv;

        // Mostrar los resultados
        System.out.println("\n--- Detalles de la venta ---");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: S/" + subtotal);
        System.out.println("IGV (18%): S/" + igv);
        System.out.println("Precio Total: S/" + precioTotal);
        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Programaventa
        Programaventa menuVentas = new Programaventa(); // Cambié de "Venta" a "Programaventa"
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            // Mostrar el menú
            menuVentas.mostrarMenu(); // Llamamos al método mostrarMenu de la instancia menuVentas

            // Leer la opción seleccionada por el usuario
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    // Realizar una venta
                    menuVentas.realizarVenta(scanner); // Pasamos el scanner a la función
                    break;
                case 2:
                    // Salir del menú
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}