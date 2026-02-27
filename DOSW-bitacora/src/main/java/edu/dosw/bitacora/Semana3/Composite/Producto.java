package edu.dosw.bitacora.Semana3.Composite;

// Hoja del composite: representa un producto individual con precio
public class Producto implements Articulo {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return this.precio;
    }
}