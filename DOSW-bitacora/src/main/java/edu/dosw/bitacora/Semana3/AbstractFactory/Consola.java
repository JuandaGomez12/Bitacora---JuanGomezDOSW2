package edu.dosw.bitacora.Semana3.AbstractFactory;

// Interfaz principal de la fábrica abstracta para consolas
public interface Consola {
    Mando crearMando();
    Videojuego crearVideojuego();
    PantallaUI crearPantalla();
}