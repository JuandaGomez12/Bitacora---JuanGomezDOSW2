package edu.dosw.bitacora.Semana3.Builder;

// Interfaz que define los pasos para construir un muñeco
public interface MuñecoBuilder {

    void construirCabeza();
    void construirCuerpo();
    void construirBrazos();
    void construirPiernas();
    void agregarAccesorios();
    Muñeco obtenerMuneco();
}