package Claseproducto;

public class Registroproductos2 {
    private String nombre;
    private double precio;

    // Constructor
    public Registroproductos2(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos para obtener el nombre y el precio del producto
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Producto: " + nombre + " | Precio: S/" + precio;
    }
}