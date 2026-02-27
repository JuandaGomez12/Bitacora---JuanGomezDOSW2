package edu.dosw.bitacora.Semana3.AbstractFactory;

// Fábrica concreta que crea los componentes de PlayStation
public class PlayStation implements Consola {

    public PlayStation() {
    }

    @Override
    public Mando crearMando() {
        return new MandoPlayStation();
    }

    @Override
    public Videojuego crearVideojuego() {
        return new VideojuegoPlayStation();
    }

    @Override
    public PantallaUI crearPantalla() {
        return new PantallaPlayStation();
    }
}