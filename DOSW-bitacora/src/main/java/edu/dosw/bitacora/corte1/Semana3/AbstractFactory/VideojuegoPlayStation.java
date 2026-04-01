package edu.dosw.bitacora.Semana3.AbstractFactory;

// Juego específico de PlayStation
public class VideojuegoPlayStation implements Videojuego {

    public VideojuegoPlayStation() {
    }

    @Override
    public void iniciar() {
        System.out.println("Juego de PlayStation iniciado");
    }
}