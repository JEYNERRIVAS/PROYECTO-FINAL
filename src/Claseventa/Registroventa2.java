package Claseventa;

import java.util.Scanner;

public class Registroventa2 {

    public static void main(String[] args) {
        // Crear una instancia del menú de ventas
        Programaventa menuVentas = new Programaventa(); // Cambié de "Registroventa2" a "Programaventa"
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