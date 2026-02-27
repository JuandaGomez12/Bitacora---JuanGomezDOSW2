package edu.dosw.bitacora.Semana3.Bridge;

// Figura concreta: círculo con un color asociado
public class FiguraCirculo extends FiguraGeometrica {

    Color colorAsignado;

    public FiguraCirculo(Color colorAsignado) {
        this.colorAsignado = colorAsignado;
    }

    @Override
    void dibujar() {
        System.out.println("Soy un círculo de color " + this.colorAsignado.getNombre());
    }
}