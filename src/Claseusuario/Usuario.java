package Claseusuario;
public class Usuario {
    private String nombreUsuario;
    private String clave;
    private boolean bloqueado;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.bloqueado = false;
    }
    // Métodos para obtener el nombre de usuario y verificar la clave
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public boolean verificarClave(String claveIngresada) {
        return clave.equals(claveIngresada);
    }
    public boolean estaBloqueado() {
        return bloqueado;
    }
    public void bloquear() {
        bloqueado = true;
    }
}