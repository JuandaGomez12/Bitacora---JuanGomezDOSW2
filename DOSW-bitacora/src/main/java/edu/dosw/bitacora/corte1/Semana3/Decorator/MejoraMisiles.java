package edu.dosw.bitacora.Semana3.Decorator;

// Mejora que aumenta el ataque de la nave con misiles
public class MejoraMisiles extends DecoradorNave {

    public MejoraMisiles(NaveGuerra nave) {
        super(nave);
    }

    @Override
    public String obtenerDescripcion() {
        return nave.obtenerDescripcion() + ", con Misiles";
    }

    @Override
    public int obtenerAtaque() {
        return nave.obtenerAtaque() + 30;
    }

    @Override
    public int obtenerDefensa() {
        return nave.obtenerDefensa();
    }
}