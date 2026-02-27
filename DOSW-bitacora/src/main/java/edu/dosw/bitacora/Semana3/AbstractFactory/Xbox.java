package edu.dosw.bitacora.Semana3.AbstractFactory;

// Fábrica concreta que crea los componentes de Xbox
public class Xbox implements Consola {

    public Xbox() {
    }

    @Override
    public Mando crearMando() {
        return new MandoXbox();
    }

    @Override
    public Videojuego crearVideojuego() {
        return new VideojuegoXbox();
    }

    @Override
    public PantallaUI crearPantalla() {
        return new PantallaXbox();
    }
}