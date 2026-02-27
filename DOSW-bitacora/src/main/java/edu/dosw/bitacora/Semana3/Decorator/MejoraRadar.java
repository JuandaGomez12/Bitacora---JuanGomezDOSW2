package edu.dosw.bitacora.Semana3.Decorator;

// Mejora que aumenta el ataque de la nave con radar
public class MejoraRadar extends DecoradorNave {

    public MejoraRadar(NaveGuerra nave) {
        super(nave);
    }

    @Override
    public String obtenerDescripcion() {
        return nave.obtenerDescripcion() + ", con Radar";
    }

    @Override
    public int obtenerAtaque() {
        return nave.obtenerAtaque() + 15;
    }

    @Override
    public int obtenerDefensa() {
        return nave.obtenerDefensa();
    }
}