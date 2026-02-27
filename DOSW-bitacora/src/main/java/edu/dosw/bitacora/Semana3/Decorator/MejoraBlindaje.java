package edu.dosw.bitacora.Semana3.Decorator;

// Mejora que aumenta la defensa de la nave
public class MejoraBlindaje extends DecoradorNave {

    public MejoraBlindaje(NaveGuerra nave) {
        super(nave);
    }

    @Override
    public String obtenerDescripcion() {
        return nave.obtenerDescripcion() + ", con Blindaje";
    }

    @Override
    public int obtenerAtaque() {
        return nave.obtenerAtaque();
    }

    @Override
    public int obtenerDefensa() {
        return nave.obtenerDefensa() + 20;
    }
}