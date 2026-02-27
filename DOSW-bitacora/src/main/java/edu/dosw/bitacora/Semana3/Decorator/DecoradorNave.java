package edu.dosw.bitacora.Semana3.Decorator;

// Decorator base: envuelve una nave y delega sus métodos
public abstract class DecoradorNave implements NaveGuerra {

    protected NaveGuerra nave;

    public DecoradorNave(NaveGuerra nave) {
        this.nave = nave;
    }

    @Override
    public String obtenerDescripcion() {
        return nave.obtenerDescripcion();
    }

    @Override
    public int obtenerAtaque() {
        return nave.obtenerAtaque();
    }

    @Override
    public int obtenerDefensa() {
        return nave.obtenerDefensa();
    }
}