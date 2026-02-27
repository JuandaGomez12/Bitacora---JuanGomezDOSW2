package edu.dosw.bitacora.Semana3.Bridge;

// Clase abstracta que representa una figura (lado de la abstracción en el bridge)
public abstract class FiguraGeometrica {

    Color color;

    // Cada figura define cómo se dibuja
    abstract void dibujar();
}