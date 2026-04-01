package edu.dosw.bitacora.Semana3.Bridge;

public class Main {

    public static void main(String[] args) {

        // Combinaciones de figuras con colores
        FiguraGeometrica circuloRojo = new FiguraCirculo(new ColorRojo());
        FiguraGeometrica cuadradoRojo = new FiguraCuadrado(new ColorRojo());

        FiguraGeometrica circuloAzul = new FiguraCirculo(new ColorAzul());
        FiguraGeometrica cuadradoAzul = new FiguraCuadrado(new ColorAzul());

        circuloRojo.dibujar();
        cuadradoRojo.dibujar();
        circuloAzul.dibujar();
        cuadradoAzul.dibujar();
    }
}