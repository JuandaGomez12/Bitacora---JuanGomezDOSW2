package edu.dosw.bitacora.Semana3.Decorator;

// Nave sin mejoras, con estadísticas base
public class NaveBase implements NaveGuerra {

    @Override
    public String obtenerDescripcion() {
        return "Nave Base";
    }

    @Override
    public int obtenerAtaque() {
        return 10;
    }

    @Override
    public int obtenerDefensa() {
        return 5;
    }
}