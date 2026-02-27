package edu.dosw.bitacora.Semana3.Bridge;

// Figura concreta: cuadrado con un color asociado
public class FiguraCuadrado extends FiguraGeometrica {

    Color colorAsignado;

    public FiguraCuadrado(Color colorAsignado) {
        this.colorAsignado = colorAsignado;
    }

    @Override
    void dibujar() {
        System.out.println("Soy un cuadrado de color " + this.colorAsignado.getNombre());
    }
}