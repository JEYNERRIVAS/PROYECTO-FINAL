package Claseusuario;
import java.util.Scanner;
import Claseusuario.Usuario;

public class ClaseUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarar laas variables
        String usuarioIngresado="";

        // Crear un usuario con nombre de usuario y clave
        Usuario usuario = new Usuario("JeynerRivas", "Ralsi131182");

        int intentos = 0;

        // Bucle para pedir el nombre de usuario y la clave
        while (intentos < 3 && !usuario.estaBloqueado()) {
            System.out.print("Ingrese el nombre de usuario: ");
            usuarioIngresado = scanner.nextLine();

            // Verificar si el nombre de usuario es correcto
            if (!usuarioIngresado.equals(usuario.getNombreUsuario())) {
                System.out.println("Nombre de usuario incorrecto.");
                continue; // Continuar el bucle si el nombre de usuario es incorrecto
            }

            System.out.print("Ingrese la clave: ");
            String claveIngresada = scanner.nextLine();

            // Verificar la clave
            if (usuario.verificarClave(claveIngresada)) {
                System.out.println("¡Acceso concedido!");
                break; // Salir del bucle si la clave es correcta
            } else {
                intentos++;
                System.out.println("Clave incorrecta. Intento " + intentos + " de 3.");
            }

            // Bloquear al usuario después de 3 intentos fallidos
            if (intentos == 3) {
                usuario.bloquear();
                System.out.println("¡Usuario bloqueado! Ha ingresado 3 veces la clave incorrecta.");
            }
        }

        scanner.close();
    }
}