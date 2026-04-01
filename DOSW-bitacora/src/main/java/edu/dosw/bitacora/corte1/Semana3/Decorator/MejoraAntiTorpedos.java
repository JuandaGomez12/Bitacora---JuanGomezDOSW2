package edu.dosw.bitacora.Semana3.Decorator;

// Mejora que aumenta ataque y defensa con sistema anti-torpedos
public class MejoraAntiTorpedos extends DecoradorNave {

    public MejoraAntiTorpedos(NaveGuerra nave) {
        super(nave);
    }

    @Override
    public String obtenerDescripcion() {
        return nave.obtenerDescripcion() + ", con Anti-Torpedos";
    }

    @Override
    public int obtenerAtaque() {
        return nave.obtenerAtaque() + 10;
    }

    @Override
    public int obtenerDefensa() {
        return nave.obtenerDefensa() + 15;
    }
}