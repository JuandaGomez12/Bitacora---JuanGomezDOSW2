package edu.dosw.bitacora.Semana2.SOLID.Calculadora;

// Interfaz que define el contrato para cualquier operación matemática
public interface Operacion {
    double ejecutar(double valorA, double valorB);
}