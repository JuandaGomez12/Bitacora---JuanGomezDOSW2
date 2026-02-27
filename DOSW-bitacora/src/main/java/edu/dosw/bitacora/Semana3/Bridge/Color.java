package edu.dosw.bitacora.Semana3.Bridge;

// Clase base que representa un color (lado de la implementación en el bridge)
public class Color {

    private String nombre;

    public Color(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}