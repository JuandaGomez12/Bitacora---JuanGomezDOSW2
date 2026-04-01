package edu.dosw.bitacora.Semana3.Composite;

import java.util.ArrayList;
import java.util.List;

// Nodo del composite: puede contener productos u otras cajas
public class Caja implements Articulo {

    private String nombre;
    private List<Articulo> contenido;

    public Caja(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
    }

    // Agrega un artículo a la caja
    void agregar(Articulo articulo) {
        this.contenido.add(articulo);
    }

    // Elimina un artículo de la caja
    void eliminar(Articulo articulo) {
        this.contenido.remove(articulo);
    }

    // Suma el precio de todos los artículos dentro de la caja
    @Override
    public double obtenerPrecio() {
        double precioTotal = 0;
        for (Articulo articulo : contenido) {
            precioTotal += articulo.obtenerPrecio();
        }
        return precioTotal;
    }
}