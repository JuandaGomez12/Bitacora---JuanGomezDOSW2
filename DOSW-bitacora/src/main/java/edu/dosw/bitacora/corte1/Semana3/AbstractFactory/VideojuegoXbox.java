package edu.dosw.bitacora.Semana3.AbstractFactory;

// Juego específico de Xbox
public class VideojuegoXbox implements Videojuego {

    @Override
    public void iniciar() {
        System.out.println("Juego de Xbox iniciado");
    }
}