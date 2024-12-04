package Claseproducto;
import java.util.Scanner;
public class ProgramaMenu {
    public static void main(String[] args) {
        // Crear una instancia del menú de ventas
        RegistroProductos menuVentas = new RegistroProductos();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            // Mostrar el menú
            menuVentas.mostrarMenu();

            // Leer la opción seleccionada por el usuario
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    // Mostrar los productos
                    menuVentas.mostrarProductos();
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